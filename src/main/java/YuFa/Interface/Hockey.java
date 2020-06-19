package YuFa.Interface;

/**
 * Created by zhangfan 2020/6/19
 */
public interface Hockey extends Sports{
    //该接口继承父接口后，要想实现现在的接口，需要实现父子所有的抽象方法。
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}
