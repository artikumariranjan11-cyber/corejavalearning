package shauryax.Multiplication;

public class MulDoubleNumber {
    public void multiplicaition() {
        Double a = 988D;
        Double b = 9D;
        Double c = a * b;
        System.out.println("mul of two number s "+ c);
    }

    public Double multiplicationAndReturnValue() {
        Double a = 987D;
        Double b = 11D;
        Double c = a * b;
        return c;
    }

    public void multiplicationByParameter(double a, double b) {
        Double d = a;
        Double e = b;
        Double f = d * e;
        System.out.println("parameter mul of two number is "+ f);
    }

    public Double multiplicationByParameterAndReturnValue(double u, double v) {
        Double w = u;
        Double x = v;
        Double z = w * x;
        return z;
    }
}
