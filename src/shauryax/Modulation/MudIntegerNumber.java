package shauryax.Modulation;

public class MudIntegerNumber {
    public static void MudIntegerNumber() {
        Integer a = 90;
        Integer b = 2;
        Integer c = a % b;
        System.out.println("modulation of two number s "+ c);
    }

    public static Integer modulationAndReturnValue() {
        Integer a = 900;
        Integer b = 20;
        Integer c = a % b;
        return c;
    }

    public static void ModulationByParameter(Integer a, Integer b) {
        Integer d = a;
        Integer e = b;
        Integer f = d % e;
        System.out.println("parameter modulation of two number is "+ f);
}

    public static Integer modulationByParameterAndReturnValue(Integer a, Integer b) {
        Integer w = a;
        Integer x = b;
        Integer z = w % x;
        return z;
    }
}
