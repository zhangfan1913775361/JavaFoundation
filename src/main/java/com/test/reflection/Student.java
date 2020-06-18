package com.test.reflection;

/**
 * Created by zhangfan 2020/6/19
 *
 * 反射的经典案例。参考文献：https://mp.weixin.qq.com/s/IqQxwQJFju_gKKkaYQP3Dg
 * 可以同时获取    Class 对象   类中的所有字段   类中的所有构造方法   类中的所有非构造方法
 *
 */
public class Student {
    private String studentName;
    public int studentAge;

    public Student() {
    }

    private Student(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    private String show(String message) {
        System.out.println("show: " + studentName + "," + studentAge + "," + message);
        return "testReturnValue";
    }


}

