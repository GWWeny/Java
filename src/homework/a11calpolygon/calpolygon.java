package homework.a11calpolygon;

public class calpolygon {
    public static void main(String[] args) {
        CShape objArr[]=new CShape[3];
        objArr[0]=new CTriangle();
        objArr[1]=new CRect();
        objArr[2]=new CPentagon();
        //增强for
        //for (CShape cShape : objArr) cShape.angle();
        //for (CShape cShape : objArr) System.out.println(cShape.toString());
        for(int i=0;i<objArr.length;i++){
            objArr[i].angle();
        }
        for(int i=0;i<objArr.length;i++){
            System.out.println(objArr[i].toString());
        }
    }

}
