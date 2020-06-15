package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //成对地用put方法放进k-y值
        map.put("lenovo",1300);
        map.put("iPhone6",5300);
        map.put("oppo R9s Plus",3500);
        //key重复时，会覆盖value值
        System.out.println(map.put("iPhone6",3500));//只输出value，即3500
        System.out.println(map);//输出大括号的集合
        //是否包含指定key
        System.out.println("是否包含Lenovo:"+map.containsKey("lenovo"));//输出true
        //是否包含指定value
        System.out.println("是否有3500块的手机："+map.containsValue(3500));//输出true

        for (Object key:map.keySet()){ //keySet返回所有key的Set集合
            System.out.println(key+"-->"+map.get(key));//Object get方法：居然是获得key的value值！！！
        }

        //根据key删除k-y对
        map.remove("lenovo");
        System.out.println(map);

        /*

        综上，有好几个常用的方法，put，remove，containsKey，containsValue,KeySet,get
         */

    }
}
