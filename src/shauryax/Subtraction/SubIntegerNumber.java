package shauryax.Subtraction;

public class SubIntegerNumber {

    public static void SubIntegerNumber() {
        Integer x = 213;
        Integer y = 122;
        Integer z = x - y;
        System.out.println("sub of two number is "+ z);
    }

    public static Integer subtractionAndReturnValue() {
        Integer a = 77;
        Integer b = 22;
        Integer c = a - b;
        return c;
    }

    public void subtractionByParameter(Integer a, Integer b) {
        Integer d = a;
        Integer e = b;
        Integer f = d - e;
        System.out.println("parameter subtraction of two number is "+ f);
    }

    public Integer subtractionByParameterAndReturnValue(Integer u, Integer v) {
        Integer w = u;
        Integer x = v;
        Integer z = w - x;
        return z;
    }
}
