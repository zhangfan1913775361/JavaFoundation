package YuFa.Encapsulation;

/**
 * Created by zhangfan 2020/6/19
 */
public class RunEncap {
    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("ZhangFan");
        encap.setAge(28);
        encap.setIdNum("13270972371");
        System.out.print("Name : " + encap.getName()+ " Age : "+ encap.getAge());
    }
}
