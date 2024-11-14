package homework.a34ex4;

enum WeekDay {
    Mon("Monday","星期一"),Tue("Tuesday","星期二"), Wed("Wednesday","星期三"),
    Thu("Thursday", "星期四"),	Fri("Friday","星期五"),Sat("Saturday","星期六"),
    Sun("Sunday", "星期日");
    private WeekDay(String en, String cn) {
        this.en = en;  this.cn = cn;
    }
    private final String en;
    private final String cn;
    public String getEn() {
        return en;
    }
    public String getCn() {
        return cn;
    }
}

