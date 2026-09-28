package shauryax.addition;

public class AddLongNumber {
    public void addition() {
        Long a = 118L;
        Long b = 22L;
        Long c = a + b;
        System.out.println("addition of two number s "+ c);
    }

    public Long additionAndReturnValue() {
        Long a = 117L;
        Long b = 22L;
        Long c = a + b;
        return c;
    }

    public void additionByParameter(long a, long b) {
        Long d = a;
        Long e = b;
        Long f = d + e;
        System.out.println("parameter addition of two number is "+ f);
    }

    public Long additionByParameterAndReturnValue(long u, long v) {
        Long w = u;
        Long x = v;
        Long z = w + x;
        return z;
    }
}
