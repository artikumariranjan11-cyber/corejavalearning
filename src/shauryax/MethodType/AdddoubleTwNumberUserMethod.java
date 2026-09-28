package shauryax.MethodType;

public class AdddoubleTwNumberUserMethod {

    public static void main(String[] args){
        double x = 98d;
        double y = 34d;
        double z = x + y;
        System.out.println("sum = "+ z);

        //addition();
        AdddoubleTwNumberUserMethod addTwoNumber  = new AdddoubleTwNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(9998d,455d);

        double artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        double pratyvalue = addTwoNumber.additionByParameterAndReturnValue(987d,455d);
        System.out.println("sum of pratyvalue = "+ pratyvalue);

    }

    //suraj
    public void addition(){
        double a = 987d;
        double b = 324d;
        double c = a + b;
        System.out.println("addition of two number is "+ c);
    }

    //Himan
    public void additionByParameter(double a, double b){
        double d = a;
        double e = b;
        double f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public double additionAndReturnValue(){
        double a = 8d;
        double b = 6d;
        double c = a + b;
        return c;
    }

    //praty
    public double additionByParameterAndReturnValue(double u, double v){
        double w = u;
        double x = v;
        double y = w + x;
        return y;

    }
}
