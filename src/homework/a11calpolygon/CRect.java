package homework.a11calpolygon;

public class CRect extends CShape{
    public CRect(){
        number=4;
        totalAngle=(number-2)*180;
    }
    @Override
    public int angle(){
        return totalAngle/number;
    }
}
