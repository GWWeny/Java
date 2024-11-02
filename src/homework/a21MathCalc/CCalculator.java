package homework.a21MathCalc;

public class CCalculator extends CTriFunc implements IFullCompute{
    public double result;
    public CCalculator()  { }
    @Override
    public double LOG(double x)  {
        return Math.log10(x);
  }
  @Override
    public double LN(double x)  {
        return Math.log1p(x);
  }
    @Override
    public double Add(double a,double b)  {
        return a+b;
 }
    @Override
    public double Sub(double a,double b)  {
    return a-b;
  }
    @Override
    public double Mul(double a,double b)  {
        return a*b;
 }
    @Override
    public double Div(double a,double b)  {
        return a/b;
 }
    @Override
    public double SIN(double x) {
        return super.SIN(x);
  }
    @Override
    public double COS(double x) {
        return super.COS(x);
  }
    @Override
    public double TAN(double x) {
        return super.TAN(x);
 }

}
