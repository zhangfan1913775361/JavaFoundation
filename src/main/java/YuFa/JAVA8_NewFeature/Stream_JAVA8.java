package YuFa.JAVA8_NewFeature;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zhangfan 2020/6/26
 * JAVA8新特性，stream流的使用
 * 目的：
 * 1、在常见操作下，如求和，去重，过滤，已经写好了API，不用用户重复造轮子，可以直接调用。
 * 2、支持并发。好几种操作一起使用。
 * 缺点:不好调试。
 *
 *步骤分为三步：
 * 1创建流，用集合创建流Arrays.asList，或者用Stream.of方法。
 * 2中间步骤，对流进行filter，map，limit，skip、sorted等处理。
 * 3.将流转化为普通格式，如string或集合。可用forEach，count，collect处理。此时全部搞定。
 */
public class Stream_JAVA8 {
    public static void main(String[] args) {
        /**
         * 1、创建流
         */
        //根据已有的集合创建流
        List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "", "Hollis");
        Stream<String> stream1 = strings.stream();

        //直接根据Stream的of方法，创建流
        Stream<String> stream2 = Stream.of("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");

        /**
         * 2、中间操作
         */
        //filter过滤！！！
//        stream1.filter(string ->!strings.isEmpty()).forEach(System.out::println);//Hollis HollisChuang hollis Hello Hollis

        //Map 键值对，映射key到value
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        numbers.stream().map( i -> i*i).forEach(System.out::println);

        //limit  保留前n位
        // skip  去掉前n位
//        numbers.stream().limit(4).forEach(System.out::println);

        //sorted  排序
//        numbers.stream().sorted().forEach(System.out::println);

        //distinct 去重
//        numbers.stream().distinct().forEach(System.out::println);

        /**
         * 3、最终操作。会消耗流，产生最终结果，之后就不能再使用流了。
         */

        //forEach  循环输出
        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
        //像第二部分有的用forEach循环输出后，其实就已经结束了。


        //count 计数
//        System.out.println(stream1.count());

        //collect 汇总约归操作
        strings  = stream1.collect(Collectors.toList());
        System.out.println(strings);

    }

}
