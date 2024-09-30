package com.GT.Day16.InterFaceDemo4;

public interface InterA {
    //格式：public default 返回值类型 方法名(参数列表){}
    //案例：public default void show(){}
    //注意事项：默认方法不是抽象方法，所以不强制被重写，但如果被重写，需要去掉default关键字。
    //public可以省略，default不能省略。
    //如果实现了多个接口，多个接口存在相同名字的默认方法，子类就必须对该方法进行重写。
    public abstract void method();
    public default void show() {
        System.out.println("InterA接口中的默认方法show");
    }
}
