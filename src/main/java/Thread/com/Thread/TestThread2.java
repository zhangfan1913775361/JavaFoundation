package Thread.com.Thread;

import org.apache.commons.io.FileUtils;

import javax.naming.Name;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by zhangfan 2020/6/15
 */
public class TestThread2 extends Thread{
    private String url;
    private String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    //下载图片线程的执行体
    @Override
    public void run(){
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载文件名："+name);
    }

    public static void main(String[] args) {
        TestThread2 testThread1 = new TestThread2("https://upload.jianshu.io/users/upload_avatars/7343313/5367345c-0b56-4b1a-b911-fdabade2e3c3.png","1.jpg");
        TestThread2 testThread2 = new TestThread2("https://upload.jianshu.io/users/upload_avatars/7343313/5367345c-0b56-4b1a-b911-fdabade2e3c3.png","2.jpg");
        TestThread2 testThread3 = new TestThread2("https://upload.jianshu.io/users/upload_avatars/7343313/5367345c-0b56-4b1a-b911-fdabade2e3c3.png","3.jpg");
        testThread1.start();
        testThread2.start();
        testThread3.start();
    }
}

//下载器
class WebDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}