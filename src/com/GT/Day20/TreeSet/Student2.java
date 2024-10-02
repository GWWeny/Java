package com.GT.Day20.TreeSet;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private double chinese;
    private double english;
    private double math;

    public Student2() {
    }

    public Student2(String name, int age, double chinese, double english, double math) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    /**
     * 获取
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    public String toString() {
        double sum=chinese+english+math;
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", english = " + english + ", math = " + math + "，score = "+ sum +"}";
    }
    //重写方法
    @Override
    public int compareTo(Student2 o) {
        double sum1=this.getEnglish()+this.getChinese()+this.getMath();
        double sum2=o.getEnglish()+o.getChinese()+o.getMath();
        //比较总分
        double i=sum1-sum2;
        //如果总分一样，比较语文
        i = i==0?this.getChinese()-o.getChinese():i;
        //如果语文一样，比较数学
        i = i==0?this.getMath()-o.getMath():i;
        //如果数学一样，比较年龄
        i = i==0?this.getAge()-o.getAge():i;
        //如果年龄一样，比较姓名
        i = i==0?this.getName().compareTo(o.getName()):i;
        return (int)i;
    }
}
