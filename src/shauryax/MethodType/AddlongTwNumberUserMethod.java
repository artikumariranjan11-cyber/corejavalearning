package shauryax.MethodType;

public class AddlongTwNumberUserMethod {
    public static void main(String[] args){
        long x = 88L;
        long y = 45L;
        long z = x + y;
        System.out.println("sum = "+ z);

        //addition();
        AddlongTwNumberUserMethod addTwoNumber  = new AddlongTwNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(98L,19L);

        long artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        long pratyvalue = addTwoNumber.additionByParameterAndReturnValue(765L,666L);
        System.out.println("sum of pratyvalue = "+ pratyvalue);

    }

    //suraj
    public void addition(){
        long a = 85L;
        long b = 96L;
        long c = a + b;
        System.out.println("addition of two number is "+ c);
    }

    //Himan
    public void additionByParameter(long a, long b){
        long d = a;
        long e = b;
        long f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public long additionAndReturnValue(){
        long a = 5L;
        long b = 6L;
        long c = a + b;
        return c;
    }

    //praty
    public long additionByParameterAndReturnValue(long u, long v){
        long w = u;
        long x = v;
        long y = w + x;
        return y;

    }
}
