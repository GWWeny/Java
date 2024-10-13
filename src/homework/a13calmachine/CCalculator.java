package homework.a13calmachine;

public class CCalculator implements IBasicCompute{
    private double result;
    public CCalculator(){

    }
    @Override
    public double Add(double a, double b) {
        return a + b;
    }
    @Override
    public double Sub(double a, double b) {
        return a - b;
    }
    @Override
    public double Mul(double a, double b) {
        return a * b;
    }
    @Override
    public double Div(double a, double b) {
        return a / b;
    }
}
