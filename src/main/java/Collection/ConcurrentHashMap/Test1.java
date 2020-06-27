package Collection.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhangfan 2020/6/27
 */
public class Test1 {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("张凡","男");
        concurrentHashMap.put("蒋雪璇","女");
        System.out.println(concurrentHashMap.get("张凡"));
    }
}
