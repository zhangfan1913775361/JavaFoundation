package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * java8中为Map新增的方法
 */
public class Test2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("lenovo",1300);
        map.put("iPhone6",5300);
        map.put("oppo R9s Plus",3500);
        //想根据某个key换掉value，可惜没有找到这个key，更换失败！！！，照常输出
        map.replace("小米手机",1000);
        System.out.println(map);

        //merge方法，在某个key的value上可做四则运算
        map.merge("lenovo",100,(o,p)->(Integer)o*(Integer)p);
//        map.merge("lenovo",100,(oldVal,param)->(Integer)oldVal+(Integer)param);
        System.out.println(map);

        //如果不存在，则用计算值充当value值
        map.computeIfAbsent("java",(key)->((String)key).length());
        System.out.println(map);

        //如果存在，则。。。。
        map.computeIfPresent("java",(key,value)->((Integer)value)+(Integer)value);
        System.out.println(map);

    }
}
