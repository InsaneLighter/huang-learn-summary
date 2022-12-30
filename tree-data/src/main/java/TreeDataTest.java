import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Time 2022-12-30 14:16
 * Created by Huang
 * className: TreeDataTest
 * Description:
 */
public class TreeDataTest {
    /**
     * 方式一：Stream流递归实现遍历树形结构
     */
    @Test
    public void treeTest1() {
        //获取数据
        List<TreeBean> treeBeans = new TreeBean().initializationData();
        //获取父节点
        List<TreeBean> collect = treeBeans.stream().filter(t -> t.getParentId() == 0).peek(
                m -> m.setChildList(getChildren(m, treeBeans)))
        .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));
    }

    /**
     * 递归查询子节点
     * @param root  根节点
     * @param all   所有节点
     * @return 根节点信息
     */
    private List<TreeBean> getChildren(TreeBean root, List<TreeBean> all) {
        return all.stream().filter(t -> Objects.equals(t.getParentId(), root.getId())).peek(
                m -> m.setChildList(getChildren(m, all))
        ).collect(Collectors.toList());
    }

    /**
     * 方法二：map构造树形结构
     */
    @Test
    public void treeTest2() {
        //获取数据
        List<TreeBean> treeBeans = new TreeBean().initializationData();
        //list数据转为map数据
        Map<Integer, TreeBean> collect = treeBeans.stream().collect(Collectors.toMap(TreeBean::getId, Function.identity()));
        //获取顶级树节点数据
        List<TreeBean> collectList = treeBeans.stream().filter(t -> !collect.containsKey(t.getParentId())).collect(Collectors.toList());
        for (TreeBean t : treeBeans) {
            if (collect.containsKey(t.getParentId())) {
                TreeBean treeBean = collect.get(t.getParentId());
                List<TreeBean> childList = treeBean.getChildList();
                childList.add(t);
            }
        }
        System.out.println(JSON.toJSONString(collectList));
    }
}
