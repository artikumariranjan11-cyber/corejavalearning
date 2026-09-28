package shauryax.Modulation;

public class MudintNumber {

    public void MudintNumber() {
        int a = 87;
        int b = 2;
        int c = a % b;
        System.out.println("modulation of two number s "+ c);
    }

    public int modulationAndReturnValue() {
        int a = 93;
        int b = 20;
        int c = a % b;
        return c;
    }

    public void ModulationByParameter(int a, int  b) {
        int d = a;
        int e = b;
        int f = d % e;
        System.out.println("parameter modulation of two number is "+ f);
    }

    public int modulationByParameterAndReturnValue(int a, int b) {
        int w = a;
        int x = b;
        int z = w % x;
        return z;
    }
}
