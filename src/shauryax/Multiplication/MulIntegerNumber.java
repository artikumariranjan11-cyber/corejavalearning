package shauryax.Multiplication;

public class MulIntegerNumber {

    public void multiplication() {
        Integer x = 22;
        Integer y = 12;
        Integer z = x * y;
        System.out.println("mul of two number is "+ z);
    }

    public Integer multiplicationAndReturnValue() {
        Integer a = 87;
        Integer b = 12;
        Integer c = a * b;
        return c;
    }

    public void multiplicationByParameter(int k, int l) {
        Integer d = k;
        Integer e = l;
        Integer f = d * e;
        System.out.println("parameter multiplication of two number is "+ f);

    }

    public Integer multiplicationByParameterAndReturnValue(int g, int h) {
        Integer w = g;
        Integer x = h;
        Integer z = w * x;
        return z;
    }
}
