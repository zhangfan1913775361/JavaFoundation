package YuFa;

/**
 * Created by zhangfan 2020/6/19
 * 如何实现字符反转？（不同于链表反转）
 */
public class Test5_CharReverse {
    public static void main(String[] args) {
        String i = "ABCDE";
//        System.out.println(myReverseString(i));
//        System.out.println(reverseStringByStringBuilder(i));
        System.out.println(reverseStringByRecursion(i));
    }

    /**
     * 手写字符串反转
     * @param str
     * @return
     */
    public static String myReverseString(String str){
        if (str != null && str.length() >0){
            int len = str.length();
            char[] chars = new char[len];
            for (int i = 0;i<len;i++){
                chars[len-i-1] = str.charAt(i);//这两行写不好容易数组越界
            }
//            return chars.toString();
//            str = chars.toString();这两行写法都是返回[C@14ae5a5，需要封装成对象输出
            return new String(chars);

        }
        return str;
    }

    /**
     * 使用StringBuilder
     */
    public static String reverseStringByStringBuilder(String str){
        if (str != null && str.length() > 0){
            return new StringBuilder(str).reverse().toString();
        }
        return str;
    }

    /**
     * 使用递归Recursion
     */
    public static String reverseStringByRecursion(String str){
//        if (str != null && str.length() >0){
            return reverseStringByStringBuilder(str);//这样的递归居然能够成功！！！！！
//        }
//        return str;
    }

}
