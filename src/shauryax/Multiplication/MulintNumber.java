package shauryax.Multiplication;

public class MulintNumber {

    public void multiplicaition() {
        int x = 22;
        int y = 12;
        int z = x * y;
        System.out.println("mul of two number is "+ z);
    }

    public int multiplicationAndReturnValue() {
        int a = 77;
        int b = 22;
        int c = a * b;
        return c;
    }

    public void multiplicationByParameter(int a, int b) {
        int d = a;
        int e = b;
        int f = d * e;
        System.out.println("parameter multiplication of two number is "+ f);

    }
    public int multiplicationByParameterAndReturnValue(int u, int v) {
        int w = u;
        int x = v;
        int z = w * x;
        return z;
    }

}
