package YuFa.JAVA8_NewFeature;

/**
 * Created by zhangfan 2020/6/20
 *
 * lamda表达式：又称闭包，“将函数当做参数传入方法中”
 * lamda表达式有如下特点：
 * 避免了匿名内部类的繁琐
 * 在集合遍历中，极大的优化了代码
 *
 *
 */
public class lambda {
    public static void main(String args[]){
        lambda tester = new lambda();



        //除了最传统的由类实现接口的抽象方法，还有使用匿名内部类的方式，也是传统的方法，如下。
        MathOperation addtition2 = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                System.out.println("这是用静态内部类实现的operation方法");
                return a+b;
            }
        };
        addtition2.operation(10,5);
        System.out.println(addtition2.operation(10,5));

        //下面这种是lambda表达式，比较先进
        // 类型声明    声不声明都可以，但是两个参数，要加都加，要不加都不加
        MathOperation addition = (int a, int b) -> a + b; //goes to 前后的括号就是抽象方法的括号。



        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句  主体只有一条语句，可以不加大括号，加了也行  有大括号一定要写return关键字，没有大括号则不写
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) ->   a / b;

        //将函数addition当参数，传进了operate方法中
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        //greetService1是函数，
        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    //这是lamda类的方法
    private int operate(int a, int b, MathOperation mathOperation){//把函数作为方法的参数
        return mathOperation.operation(a, b);
    }
}
