package YuFa.JAVA8_NewFeature;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

/**
 * Created by zhangfan 2020/7/13
 * 参考狂神视频
 */
public class lambdaTest2 {
    //3.构造静态内部类（把实现类直接写在类里，并加上static）
    static class Like2 implements ILike{
        @Override
        public void like() {
            System.out.println("I like Lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.like();
        //静态内部类
        like = new Like2();
        like.like();

        //4、局部内部类（写在方法里面）
        class Like3 implements ILike{
            @Override
            public void like() {
                System.out.println("I like Lambda3");
            }
        }
        like = new Like3();
        like.like();

        //5、匿名内部类 没有类的名称，必须借助接口或者父类
        like = new ILike() {//本行没有用'类implements接口'的方式，而是'new 接口'
            @Override
            public void like() {
                System.out.println("I like Lambda4");
            }
        };
        like.like();

        //6、lambda表达式
        like = ()->{
            System.out.println("I like Lambda5");
        };
        like.like();

    }
}

//1、定义一个函数式接口（只有一个抽象方法的接口）
interface ILike{
    void like();
}

//2.实现类
class Like implements ILike{
    @Override
    public void like() {
        System.out.println("I like Lambda");
    }
}
