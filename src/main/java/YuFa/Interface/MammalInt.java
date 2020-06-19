package YuFa.Interface;

/**
 * Created by zhangfan 2020/6/19
 */
public class MammalInt implements Animal{
    public void eat(){
        System.out.println("哺乳动物 eat");
    }
    public void travel(){
        System.out.println("哺乳动物 travel");
    }

    public static void main(String[] args) {
        MammalInt mammalInt = new MammalInt();
        mammalInt.eat();
        mammalInt.travel();
    }

}
