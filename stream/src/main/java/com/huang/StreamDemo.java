package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Time 2022-10-26 17:19
 * Created by Huang
 * className: Demo
 * Description:
 */
@Slf4j
public class StreamDemo {
    List<String> normalList = new ArrayList(){{
        for (int i = 0; i < 50; i++) {
            add(String.valueOf(i));
        }
        add("0");
        add("1");
        add("2");
    }};

    /**
     * @Description: filter选中符合条件的元素返回
     * @return: void
     **/
    @Test
    public void filterTest(){
        normalList.stream().filter("1"::equals).forEach(log::info);
    }

    /**
     * @Description: 操作集合中元素返回新集合
     * @return: void
     **/
    @Test
    public void mapTest(){
        List<String> collectList = normalList.stream().map(item -> item + ":map:" + item).collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    /**
     * @Description: 去重
     * @return: void
     **/
    @Test
    public void distinct(){
        List<String> collectList = normalList.stream().distinct().collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    /**
     * @Description: 排序
     * @return: void
     **/
    @Test
    public void sortedTest(){
        List<String> collectList = normalList.stream().sorted().collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    /**
     * @Description: 重写排序接口->排序
     * @return: void
     **/
    @Test
    public void diySortedTest(){
        //升序
        //< return -1
        //> return 1
        //= return 0

        //降序
        //< return 1
        //> return -1
        //= return 0
        List<String> collectList = normalList.stream().sorted((o1, o2) -> {
            if(o1.length() > o2.length()){
                return -1;
            }
            return 1;
        }).collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    /**
     * @Description: 跳过前指定个数元素
     * @return: void
     **/
    @Test
    public void skip(){
        List<String> collectList = normalList.stream().skip(1).collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    /**
     * @Description: 返回集合中前指定个数元素
     * @return: void
     **/
    @Test
    public void limit(){
        List<String> collectList = normalList.stream().limit(10).collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    /**
     * @Description: 集合个数
     * @return: void
     **/
    @Test
    public void count(){
        long count = normalList.stream().count();
        log.info("count:{}",count);
    }

    /**
     * @Description: 把一个Stream的所有元素按照聚合函数聚合成一个结果
     * @return: void
     **/
    @Test
    public void reduce(){
        ArrayList<Integer> list = new ArrayList() {{
            for (int i = 1; i < 101; i++) {
                add(i);
            }
        }};
        Integer reduce = list.stream().reduce(0, Integer::sum);
        log.info("reduce:{}",reduce);
    }

    /**
     * @Description: 返回第一个元素
     * @return: void
     **/
    @Test
    public void findFirst(){
        Optional<String> first = normalList.stream().findFirst();
        first.ifPresent(s -> log.info("first:{}", s));
    }

    /**
     * @Description: 返回任意一个元素
     * @return: void
     **/
    @Test
    public void any(){
        Optional<String> any = normalList.stream().findAny();
        any.ifPresent(s -> log.info("any:{}", s));
    }

    /**
     * @Description: 返回任意一个元素
     * @return: void
     **/
    @Test
    public void flatMap(){
        List<List<String>> list = new ArrayList<>();
        list.add(normalList);
        list.add(normalList);
        List<String> collectList = list.stream().flatMap(item -> item.stream().filter(Objects::nonNull)).collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

    @Test
    public void toUpper(){
        List<String> collectList = Stream.of("a", "b", "c", "d")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        log.info("collectList:{}",collectList);
    }

}
