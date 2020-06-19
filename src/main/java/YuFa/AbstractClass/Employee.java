package YuFa.AbstractClass;

/**
 * Created by zhangfan 2020/6/19
 * 1. 抽象类不能被实例化(初学者很容易犯的错)。如果试图实例化，就会报错。只有抽象类的非抽象子类可以创建对象。
 * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类（类似一滴血原则，哈哈，粘上抽象方法就是抽象类）。
 * 3. 抽象方法不含方法体。
 * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
 * 5. 抽象类的子类必须实现抽象方法，不然子类也要声明为抽象类
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number)
    {
        System.out.println("这是抽象类的构造方法");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    //含有抽象方法的类，一定是抽象类！！
    public abstract double computePay();//抽象类直接加分号，不加花括号。
    public void mailCheck()
    {
        System.out.println("父类的方法2 " + this.name + " " + this.address);
    }
    public String getName()
    {
        return name;
    }
}
