package YuFa;

/**
 * Created by zhangfan 2020/6/17
 * Switch case的顺序结构，可判断多种数据类型。可以用String，不能判断Boolean
 */
public class Test4_Switch {
    public static void main(String[] args) {
        String session = "夏天";
        switch(session){
            case "春天" :
                System.out.println("Spring");
                break; //可选
            case "夏天" :
                System.out.println("Summer");
                break; //可选
            case "秋天":
                System.out.println("Autumn");
                break;
            default : //可选
                System.out.println("找不到");
        }
    }
}
