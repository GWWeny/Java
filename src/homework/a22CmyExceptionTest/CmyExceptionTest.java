package homework.a22CmyExceptionTest;

public class CmyExceptionTest {
    public static void main(String args[])  //勿修改 main内容
    {
        System.out.println("2的 5次方=" + powerXY(2, 5));
        System.out.println("2的 0次方=" + powerXY(2, 0));
        System.out.println("0的 0次方=" + powerXY(0, 0));  //例外
        System.out.println("2的 -2次方=" + powerXY(2, -2)); //例外
    }

    static int powerXY(int x, int y)   //可修改powerXY内容
    {
        try {
            if (x == 0 && y == 0) throw new CmyException("0的0次方无定义,回传值将错误       ");
            else if (y < 0) throw new CmyException("次方为负值,结果不为整数,回传值将错误     ");
            return (int)Math.pow(x, y);
        }catch(CmyException e){
            System.out.print(e.getMessage());
            return -1;
        }
    }
}