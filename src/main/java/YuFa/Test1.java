package YuFa;

/**
 *
 *比较==与equals的区别。
 * ==比较的是内存地址，也就是是否为同一个对象。
 * equals在jdk中被重写了，比较的是内容是否一致。
 *
 * Created by zhangfan 2020/6/19
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "1";
        //==比较的是地址，equals比较的是内容。
        System.out.println(s1.equals(s2));//true，内容相同
        System.out.println(s1 == s2);//地址相同，说明是一个对象


        String s3 = new String("a");
        String s4 = new String("a");
        System.out.println(s3+"和"+s4);

        System.out.println(s3==s4);// false 不是一个对象，地址不同
        System.out.println(s3.equals(s4));//true 内容相同

    }
}
