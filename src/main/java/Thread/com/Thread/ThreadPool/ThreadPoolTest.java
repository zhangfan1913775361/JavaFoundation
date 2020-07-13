package Thread.com.Thread.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangfan 2020/7/13
 * 记住两个就行，ExecutorService接口与Executors工具类。
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //1.创建服务，创建线程池
        //创建了一个固定数量的线程池。ExecutorService是多线程真正的接口，Executors是工具类
        ExecutorService service = Executors.newFixedThreadPool(10);

        //执行
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        //通过runnable实现的线程用execute启动，用callable实现的线程用submit启动。
        service.execute(myThread1);
        service.execute(myThread1);
        service.execute(myThread2);
        service.execute(myThread2);

        //2、关闭链接
        service.shutdown();


    }
}
class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
