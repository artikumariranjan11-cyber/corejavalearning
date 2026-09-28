package shauryax.MethodType;

public class MuldoubleTwNumberUserMethod {

    public static void main(String[] args) {

        double x = 12d;
        double y = 4d;
        double z = x * y;
        System.out.println("mul = " + z);

        //multiplication();
        MuldoubleTwNumberUserMethod mulTwoNumber = new MuldoubleTwNumberUserMethod();;
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicationByParameter(62d, 9d);

        double artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = " + artivalue);

        double pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(96d, 4d);
        System.out.println("mul of pratyvalue is " + pratyvalue);

    }
    //praty
    public double multiplicationByParameterAndReturnValue(double a,double b){
        double w = a;
        double x = b;
        double z = a * b;
        return z;
    }

    //arti
    public double multiplicationAndReturnValue() {
        double a = 522d;
        double b = 69d;
        double c = a * b;
        return c;
    }

    //himans
    public void multiplicationByParameter(double a, double b) {
        double d = a;
        double e = b;
        double f = d * e;
        System.out.println("parameter multiplication of two number is " + f);
    }


    //suraj
    public void multiplication() {
        double a = 77d;
        double b = 10d;
        double c = a * b;
        System.out.println("mul of two number is " + c);
    }
}
