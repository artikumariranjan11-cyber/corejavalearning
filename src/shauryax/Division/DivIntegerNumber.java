package shauryax.Division;

public class DivIntegerNumber {

    public void division() {
        Integer a = 400;
        Integer b = 2;
        Integer c = a / b;
        System.out.println("division of two number s "+ c);
    }

    public Integer divisionAndReturnValue() {
        Integer a = 900;
        Integer b = 20;
        Integer c = a / b;
        return c;
    }

    public void divisionByParameter(Integer a, Integer b) {
        Integer d = a;
        Integer e = b;
        Integer f = d / e;
        System.out.println("parameter division of two number is "+ f);
    }

    public Integer divisionByParameterAndReturnValue(Integer a, Integer b) {
        Integer w = a;
        Integer x = b;
        Integer z = w / x;
        return z;
    }
}
