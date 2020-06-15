package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangfan 2020/5/15
 * 泛型Generic
 */

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("我喜欢的第一本书");
        list.add("我喜欢的第二本书");
        list.add("我喜欢的第三本书");
        list.add(5);
        list.forEach(Str -> System.out.println(Str));
        System.out.println(list);//直接输出ArrayList为数组格式
    }
}
