package shauryax.Multiplication;

public class MulFloatNumber {


    public void multiplication() {
        Float x = 227F;
        Float y = 125F;
        Float z = x * y;
        System.out.println("mul of two number is "+ z);
    }

    public Float multiplicationAndReturnValue() {
        Float a = 778F;
        Float b = 228F;
        Float c = a * b;
        return (float) c;
    }

    public void multiplicationByParameter(Float a, Float b) {
        Float d = a;
        Float e = b;
        Float f = d * e;
        System.out.println("parameter multiplication of two number is "+ f);
    }

    public Float multiplicationByParameterAndReturnValue(Float u, Float v) {
        Float w = u;
        Float x = v;
        Float z = w * x;
        return (float) z;
    }
}
