package shauryax.MethodType;

public class SublongTwNumberUsermethod {

    public static void main(String[] args) {

        long x = 566l;
        long y = 324l;
        long z = x - y;
        System.out.println("sub = " + z);

        //subtraction();
        SublongTwNumberUsermethod subTwoNumber = new SublongTwNumberUsermethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(765l, 233l);

        long artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = " + artivalue);

        long pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(987l, 660l);
        System.out.println("sub of pratyvalue is " + pratyvalue);

    }
    //praty
    public long subtractionByParameterAndReturnValue(long a,long b){
        long w = a;
        long x = b;
        long z = a - b;
        return z;
    }

    //arti
    public long subtractionAndReturnValue() {
        long a = 576l;
        long b = 232l;
        long c = a - b;
        return c;
    }

    //himans
    public void subtractionByParameter(long a, long b) {
        long d = a;
        long e = b;
        long f = d - e;
        System.out.println("parameter subtraction of two number is " + f);
    }


    //suraj
    public void subtraction() {
        long a = 987l;
        long b = 126l;
        long c = a - b;
        System.out.println("subtraction of two number is " + c);
    }
}
