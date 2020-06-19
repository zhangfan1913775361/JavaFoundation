package YuFa;

/**
 * Created by zhangfan 2020/6/19
 * 基本数据类型和包装数据类型使用==和equals比较的结果
 */
public class Test2 {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        int i5 = 200;
        int i6 = 200;

        /**
         * 用==时。如果数值不等肯定返回false，数值相等时，只有包装间的非缓存才是false，其余全是true！！！
         */
        System.out.println(i5 == i6);//基本数据类型之间使用==，只要值相同就打印true。
        System.out.println(i4 == i5);//基本数据类型和包装类型使用==，只要值相同也打印true。

        System.out.println(i1 == i2);//都是包装类型，处于-128到127间被JVM缓存，返回true（情况特殊）
        System.out.println(i3 == i4);//都是包装类型，一般都是返回false

        /**
         * 全用equals，只要数值相同，全是true！！！！！
         */
        System.out.println(i1.equals(i2));//true
        System.out.println(i3.equals(i4));//true
        System.out.println(i4.equals(i5));//还是true
                                          // 基本数据类型之间没有equals，不存在比较。

        /**
         * new b2时，与b1其实是一个对象，所以==为true，再new一个b3则为两个对象，==为false。
         */
        byte b1 = 127;//byte字符一个字节8位，最大为127，最小为-128
        Byte b2 = new Byte("127");
        Byte b3 = new Byte("127");
        System.out.println("Byte的基本数据类型和包装数据类型==比较"+(b1 == b2));//true
        System.out.println("Byte的基本数据类型和包装数据类型equals比较"+ b2.equals(b1));//true
        System.out.println("Byte的包装数据类型之间==比较"+(b2 == b3));//false
        System.out.println("Byte的包装数据类型之间equals比较"+b2.equals(b3));//true

        short s1 = 12;
        Short s2 = new Short("12");
        Short s3 = new Short("12");
        short s4 = new Short("12");//hashcodet与S1相同，并没创建新对象
        System.out.println("Short的基本数据类型和包装数据类型==比较"+(s1 == s2));//true.其实s1和s2的hashcode值不同，但也认为是一个对象了。
        System.out.println("Short的包装数据之间==比较"+( s2 == s3 ));//false
        System.out.println("Short的包装数据之间==比较"+( s1 == s4 ));//true

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));//hashcodet与S1相同，并没创建新对象


        String t1 = "12";
        String t2 = new String("12");
        String t3 = new String("12");
        String t4 = new String("12");//String下新对象创建不出来了
        /**
         * 基本和包装间的
         */
        System.out.println("String的基本数据类型和包装数据类型==比较"+(t1 == t2));//false
        System.out.println("String的包装数据之间==比较"+( t2 == t3 ));//false
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));//hashcodet与S1相同，并没创建新对象


        Integer age1 = 10;
//        Integer age2 = 10;
        Integer age3 = new Integer(10);
//        Integer age4 = new Integer(10);
//        System.out.println((age1 == age2));//true
        System.out.println((age1 == age3));//false
//        System.out.println((age3 == age4));//false
        System.out.println(System.identityHashCode(age1));
//        System.out.println(System.identityHashCode(age2));
        System.out.println(System.identityHashCode(age3));
//        System.out.println(System.identityHashCode(age4));




    }
}

