package YuFa.Encapsulation;

/**
 * Created by zhangfan 2020/6/19
 * 封装是一种将函数式接口的实现细节隐藏起来的方式，保护代码不被外界随机访问。
 * 优点：减少耦合；内部可自由修改；隐藏内部实现细节；
 */
public class EncapTest {

    //将成员变量设为私有，只有本类可以访问，达到了隐藏信息的效果。
    private String name;
    private String idNum;
    private int age;

    //提供getter，setter方法，用于对私有属性的访问。
    public String getName() {
        return name;
    }

    //使用this关键字，为区别成员变量name和方法的name。
    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
