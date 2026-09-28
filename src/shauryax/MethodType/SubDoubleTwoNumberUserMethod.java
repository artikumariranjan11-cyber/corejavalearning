package shauryax.MethodType;

public class SubDoubleTwoNumberUserMethod {

    public static void main(String[] args){
        Double x = 92.3d;
        Double y = 55.8d;
        Double z = x - y;
        System.out.println("sub = "+ z);

        //subtraction();
        SubDoubleTwoNumberUserMethod subTwoNumber = new SubDoubleTwoNumberUserMethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(999d,638d);

        Double artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = "+ artivalue);


        Double pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(122d,22d);
        System.out.println("sub of pratyvalue = "+ pratyvalue);
    }
    //suraj
    public void subtraction(){
        Double a = 43.3d;
        Double b = 23.2d;
        Double c = a - b;
        System.out.println("subtraction of two number is "+ c);
    }
    //himan
    public void subtractionByParameter(Double a , Double b){
        Double d = a;
        Double e = b;
        Double f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);
    }
    //arti
    public Double subtractionAndReturnValue(){
        Double a = 33.8d;
        Double b = 44.6d;
        Double c = a - b;
        return c;
    }
    //praty
    public Double subtractionByParameterAndReturnValue(Double u, Double v){
        Double w = u;
        Double x = v;
        Double y = w - x;
        return y;
    }
}
