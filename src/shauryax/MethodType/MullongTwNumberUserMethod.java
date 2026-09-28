package shauryax.MethodType;

public class MullongTwNumberUserMethod {

    public static void main(String[] args) {

        long x = 222l;
        long y = 43l;
        long z = x * y;
        System.out.println("mul = " + z);

        //multiplication();
        MullongTwNumberUserMethod mulTwoNumber = new MullongTwNumberUserMethod();;
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicationByParameter(992l, 59l);

        long artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = " + artivalue);

        long pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(967l, 924l);
        System.out.println("mul of pratyvalue is " + pratyvalue);

    }
    //praty
    public long multiplicationByParameterAndReturnValue(long a,long b){
        long w = a;
        long x = b;
        long z = a * b;
        return z;
    }

    //arti
    public long multiplicationAndReturnValue() {
        long a = 99l;
        long b = 69l;
        long c = a * b;
        return c;
    }

    //himans
    public void multiplicationByParameter(long a, long b) {
        long d = a;
        long e = b;
        long f = d * e;
        System.out.println("parameter multiplication of two number is " + f);
    }


    //suraj
    public void multiplication() {
        long a = 887L;
        long b = 10L;
        long c = a * b;
        System.out.println("mul of two number is " + c);
    }
}
