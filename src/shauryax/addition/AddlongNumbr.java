package shauryax.addition;

public class AddlongNumbr {
    public void addition() {
        long a = 118l;
        long b = 22l;
        long c = a + b;
        System.out.println("addition of two number s "+ c);
    }

    public long additionAndReturnValue() {
        long a = 117l;
        long b = 22l;
        long c = a + b;
        return c;
    }

    public void additionByParameter(long a, long b) {
        long d = a;
        long e = b;
        long f = d + e;
        System.out.println("parameter addition of two number is "+ f);
    }

    public long additionByParameterAndReturnValue(long u, long v) {
        long w = u;
        long x = v;
        long z = w + x;
        return z;
    }
}
