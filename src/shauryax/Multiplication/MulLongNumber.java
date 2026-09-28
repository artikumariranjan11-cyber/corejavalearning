package shauryax.Multiplication;

public class MulLongNumber {


    public void multiplication() {
        Long a = 118L;
        Long b = 22L;
        Long c = a * b;
        System.out.println("multiplication of two number s "+ c);
    }

    public Long multiplicationAndReturnValue() {
        Long a = 117L;
        Long b = 22L;
        Long c = a * b;
        return c;

    }

    public void multiplicationByParameter(long a, long b) {
        Long d = a;
        Long e = b;
        Long f = d * e;
        System.out.println("parameter mul of two number is "+ f);
    }

    public Long multiplicationByParameterAndReturnValue(long u, long v) {
        Long w = u;
        Long x = v;
        Long z = w * x;
        return z;
    }
}
