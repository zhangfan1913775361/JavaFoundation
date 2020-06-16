package Thread.com.Thread;

/**
 * Created by zhangfan 2020/6/16
 *
 * 通过实现Runnable接口的方式，来实现多线程
 */
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码---"+i);
        }
    }
    public static void main(String[] args) {
        //创建Runnable接口实现类的对象
        TestThread3 testThread3 = new TestThread3();
//        Thread thread = new Thread(testThread3);
//        thread.start();
        new Thread(testThread3).start();

        //主方法本来就有一个线程，我们手写下
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程"+i);
        }

    }
}
