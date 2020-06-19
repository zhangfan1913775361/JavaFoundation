package YuFa.Interface;

/**
 * Created by zhangfan 2020/6/19
 * 类不能多继承，但是接口可以多继承！！！
 */
//一个类只能继承一个类，却可以实现多个接口。并且接口还可以继承多个接口，如下：
public interface Football extends Sports,Hockey{
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}
