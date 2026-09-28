package shauryax.addition;

public class AddIntegerNumber {
    public void addition(){
        Integer a = 91;
        Integer b = 88;
        Integer c = a + b;
        System.out.println("addition of two number s "+ c);
    }
    public void additionByParameter(Integer a, Integer b){
        Integer d = a;
        Integer e = b;
        Integer f = d + e;
        System.out.println("parameter addition of two number is "+ f);
    }
    public Integer additionAndReturnValue(){
        Integer a = 77;
        Integer b = 11;
        Integer c = a + b;
        return c;
    }

    public Integer additionByParameterAndReturnValue(Integer u, Integer v) {
        Integer w = u;
        Integer x = v;
        Integer z = w + x;
        return z;
    }

}
