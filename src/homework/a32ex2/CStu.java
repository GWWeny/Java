package homework.a32ex2;

public class CStu {
    public int id;
    public String name;
    public int score;
    public CStu(int i,String j,int k)
    {
        this.id=i;
        this.name=j;
        this.score=k;
    }
    public void showData()
    {System.out.print("学号:" + id);
        System.out.print("\t姓名:" + name);
        System.out.println("\t成绩:" + score);}
}

