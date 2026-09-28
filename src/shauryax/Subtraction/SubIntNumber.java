package shauryax.Subtraction;

public class SubIntNumber {
    public void subtraction() {
        int x = 21;
        int y = 12;
        int z = x - y;
        System.out.println("sub of two number is "+ z);
    }

    public int subtractionAndReturnValue() {
        int a = 77;
        int b = 22;
        int c = a - b;
        return c;

    }

    public void subtractionByParameter(int a, int b) {
        int d = a;
        int e = b;
        int f = d - e;
        System.out.println("parameter subtraction of two number is "+ f);

    }

    public int subtractionByParameterAndReturnValue(int u, int v) {
        int w = u;
        int x = v;
        int z = w - x;
        return z;
    }
}
