package homework.a11calpolygon;

public class CPentagon extends CShape{
    public CPentagon(){
        number=5;
        totalAngle=(number-2)*180;
    }
    @Override
    public int angle(){
        return totalAngle/number;
    }
}
