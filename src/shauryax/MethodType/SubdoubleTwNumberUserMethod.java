package shauryax.MethodType;

public class SubdoubleTwNumberUserMethod {

    public static void main(String[] args){
        double x = 92.3d;
        double y = 55.8d;
        double z = x - y;
        System.out.println("sub = "+ z);

        //subtraction();
        SubdoubleTwNumberUserMethod subTwoNumber = new SubdoubleTwNumberUserMethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(439d,232d);

        double artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = "+ artivalue);


        double pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(543d,122d);
        System.out.println("sub of pratyvalue = "+ pratyvalue);
    }
    //suraj
    public void subtraction(){
        double a = 876d;
        double b = 812d;
        double c = a - b;
        System.out.println("subtraction of two number is "+ c);
    }
    //himan
    public void subtractionByParameter(double a , double b){
        double d = a;
        double e = b;
        double f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);
    }
    //arti
    public double subtractionAndReturnValue(){
        double a = 876d;
        double b = 342d;
        double c = a - b;
        return c;
    }
    //praty
    public double subtractionByParameterAndReturnValue(double u, double v){
        double w = u;
        double x = v;
        double y = w - x;
        return y;
    }
}
