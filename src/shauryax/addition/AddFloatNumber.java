package shauryax.addition;

public class AddFloatNumber {
    public void addition() {
        Float a = 912F;
        Float b = 88F;
        Float c = a + b;
        System.out.println("addition of two number s "+ c);
    }

    public Float additionAndReturnValue() {
        Float a = 727F;
        Float b = 11F;
        Float c = a + b;
        return c;
    }

    public void additionByParameter(Float a, Float b) {
        Float d = a;
        Float e = b;
        Float f = d + e;
        System.out.println("parameter addition of two number is "+ f);
    }

    public Float additionByParameterAndReturnValue(Float u, Float v) {
        Float w = u;
        Float x = v;
        Float z = w + x;
        return z;
    }
}
