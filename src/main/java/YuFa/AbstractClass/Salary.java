package YuFa.AbstractClass;

/**
 * Created by zhangfan 2020/6/19
 */
public class Salary extends Employee{
    private double salary; //Annual salary
    //构造方法
    public Salary(String name, String address, int number, double salary)
    {
        //此处的super只继承父类的前三个参数，所以第四个参数没有了，默认为0
        super(name, address, number);
    }
    //成员方法
    public void mailCheck()
    {
//        System.out.println("Within mailCheck of Salary class ");
        System.out.println("子类的成员方法2    " + getName()
                + " with salary " + salary);
    }
    public double computePay(){
        System.out.println("这是子类实现的父类抽象方法");
        return 200;
    }
}
