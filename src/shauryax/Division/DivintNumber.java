package shauryax.Division;

public class DivintNumber {

    public static void division() {
        int a = 900;
        int b = 2;
        int c = a / b;
        System.out.println("division of two number s "+ c);
    }

    public int divisionAndReturnValue() {
        int a = 800;
        int b = 20;
        int c = a / b;
        return c;
    }

    public void divisionByParameter(int a, int b) {
        int d = a;
        int e = b;
        int f = d / e;
        System.out.println("parameter division of two number is "+ f);
    }

    public int divisionByParameterAndReturnValue(int a, int b) {
        int w = a;
        int x = b;
        int z = w / x;
        return z;
    }
}
