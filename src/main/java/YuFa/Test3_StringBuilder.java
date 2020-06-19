package YuFa;

/**
 * Created by zhangfan 2020/6/19
 *
 * 为什么要引入StringBuilder？因为String是引用数据类型，所以变量名存在栈里，实际的值存在堆里。每次对String进行操作都要不断的
 * 在堆里开辟内存，太浪费了。所以引入了StringBuilder和StringBuffer。可以多次修改，不产生新的对象。
 * 首选StringBuilder，速度快！不过线程不安全！
 */
public class Test3_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append("I");
        stringBuilder.append(" Love ");
        System.out.println(stringBuilder);
    }
}
