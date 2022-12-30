import java.util.ArrayList;
import java.util.List;

public class TreeBean {
 
    /**
     * id
     */
    private Integer id;
 
    /**
     * 名称
     */
    private String name;
 
    /**
     * 父id ，根节点为0
     */
    public Integer parentId;
 
    /**
     * 子节点信息
     */
    public List<TreeBean> childList;
 
    public TreeBean() {
    }
 
    public TreeBean(Integer id, String name, Integer parentId, List<TreeBean> childList) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.childList = childList;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getParentId() {
        return parentId;
    }
 
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
 
    public List<TreeBean> getChildList() {
        return childList;
    }
 
    public void setChildList(List<TreeBean> childList) {
        this.childList = childList;
    }
 
    /**
     * 初始化数据
     * @return
     */
    public List<TreeBean> initializationData() {
        List<TreeBean> list = new ArrayList<>();
        TreeBean t1 = new TreeBean(1, "1", 0, new ArrayList<>());
        TreeBean t2 = new TreeBean(11, "11", 1, new ArrayList<>());
        TreeBean t3 = new TreeBean(2, "2", 0, new ArrayList<>());
        TreeBean t4 = new TreeBean(22, "22", 2, new ArrayList<>());
        TreeBean t5 = new TreeBean(3, "3", 0, new ArrayList<>());
        TreeBean t6 = new TreeBean(33, "33", 3, new ArrayList<>());
        TreeBean t7 = new TreeBean(111, "111", 11, new ArrayList<>());
        TreeBean t8 = new TreeBean(222, "222", 22, new ArrayList<>());
        TreeBean t9 = new TreeBean(333, "333", 33, new ArrayList<>());
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
        list.add(t7);
        list.add(t8);
        list.add(t9);
        return list;
    }
 
 
}