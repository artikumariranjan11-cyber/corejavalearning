package shauryax.addition;

public class AddintNumber {

    public void addition(){
        int a = 11;
        int b = 22;
        int c = a + b;
        System.out.println("addition of two number s "+ c);
    }
    public void additionByParameter(int a, int b){
        int d = a;
        int e = b;
        int f = d + e;
        System.out.println("parameter addition of two number is "+ f);
    }
    public int additionAndReturnValue(){
        int a = 11;
        int b = 22;
        int c = a + b;
        return c;
    }

    public int additionByParameterAndReturnValue(int u, int v) {
        int w = u;
        int x = v;
        int z = w + x;
        return z;
    }


}
