package YuFa.AbstractClass;

/**
 * Created by zhangfan 2020/6/19
 */
public class AbstractDemo2 {
    public static void main(String [] args)
    {
        //只要这里实例化一次，就会调用一次构造方法！！
        Salary s = new Salary("ZhangFan", "Shanghai", 3, 200.00);

        //向上转型，可以获取父类的方法，不能获取子类独特的方法，（如果子类重写过，则调用重写后的方法）
        Employee e = new Salary("Bruce Zhang", "Hangzhou", 2, 2400.00);

        s.mailCheck();

        e.mailCheck();

        //还输出返回的200.0。double保留一位
        System.out.println(e.computePay());

    }
}
