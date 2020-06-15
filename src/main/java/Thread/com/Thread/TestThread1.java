package Thread.com.Thread;

/**
 * Created by zhangfan 2020/6/15
 */
public class TestThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("从线程------"+i);
        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        //如果使用run方法，那就是普通的逻辑了，继承Thread类无意义，就必须先执行完run方法，才能执行主方法。
        //而启动start方法，就可以巧妙的使用Thread类里的机制，使两个线程可以并发运行。
//        testThread1.run();
        testThread1.start();

        //main主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("我是主线程"+i);

        }
    }
}
