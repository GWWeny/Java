package homework.a11calpolygon;

public class CTriangle extends CShape{
    public CTriangle(){
        number=3;
        totalAngle=(number-2)*180;
    }
    @Override
    public int angle() {
        return totalAngle/number;
    }
}
