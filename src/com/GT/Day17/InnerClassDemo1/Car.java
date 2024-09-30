package com.GT.Day17.InnerClassDemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
        e.show();
    }
    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println("Car Age: " + carAge);
            System.out.println(engineAge);
        }
    }
}
