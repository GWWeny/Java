package com.GT.Day14;

public class Test3 {
    public static void main(String[] args) {
        Manager m = new Manager("001","zhangsan",15000,8000);
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBouns());
        m.work();
        m.eat();
        Cook c=new Cook();
        c.setId("002");
        c.setName("nihua");
        c.setSalary(8000);
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.work();
        c.eat();
    }
}
class Employee{
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("员工在工作");
    }
    public void eat(){
        System.out.println("员工在吃米饭");
    }
}
class Manager extends Employee{
    private double bouns;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}
class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("厨师在炒菜");
    }
}
