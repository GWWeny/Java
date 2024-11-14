package homework.a32ex2;

public class CMyComparator2 {
    public static int compare(CStu o1,CStu o2)
    {
        if(o1.score < o2.score)
            return -1;
        else if(o1.score == o2.score)
            return 0;
        else if(o1.score > o2.score)
            return 1;
        return 0;
    }
}

