package homework.a32ex2;

public class CMyComparator1 {
    public static int compare(Object o1,Object o2)
    {
        if(o1 instanceof CStu && o2 instanceof CStu)
        {
            if(((CStu)o1).id < ((CStu)o2).id)
                return -1;
            else if(((CStu)o1).id == ((CStu)o2).id)
                return 0;
            else if(((CStu)o1).id > ((CStu)o2).id)
                return 1;
        }
        return 0;
    }
}

