package shauryax.addition;

public class AddDoubleNumber {

    public void addition() {
        Double a = 988d;
        Double b = 9d;
        Double c = a + b;
        System.out.println("addition of two number s "+ c);
    }

    public Double additionAndReturnValue() {
        Double a = 987d;
        Double b = 11d;
        Double c = a + b;
        return c;
    }

    public void additionByParameter(double a, double b) {
        Double d = a;
        Double e = b;
        Double f = d + e;
        System.out.println("parameter addition of two number is "+ f);
    }

    public Double additionByParameterAndReturnValue(double u, double v) {
        Double w = u;
        Double x = v;
        Double z = w + x;
        return z;
    }
}
