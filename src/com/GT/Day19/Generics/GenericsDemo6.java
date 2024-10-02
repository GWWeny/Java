package com.GT.Day19.Generics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Student2> list4 = new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);
        //method(list4);

        //希望：本方法虽不确定类型，但是以后只能传递Ye，Fu，Zi
        //此时，我们可以使用泛型的通配符
        //?也表示不确定的类型
        //它可以进行类型的限定
        //? extends E:表示可以传递E或E子类的类型
        //? super E:表示可以传递E或E父类的类型
    }
    public static void method(ArrayList<? extends Ye> list) {}
    class Student2{}
    static class Ye {}
    class Fu extends Ye { }
    class Zi extends Fu { }
}
