package shauryax.MethodType;

public class MulDoubleTwoNumberUsermethode {

    public static void main(String[] args) {

        Double x = 22d;
        Double y = 43d;
        Double z = x * y;
        System.out.println("mul = " + z);

        //multiplication();
        MulDoubleTwoNumberUsermethode mulTwoNumber = new MulDoubleTwoNumberUsermethode();;
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicationByParameter(72d, 98d);

        Double artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = " + artivalue);

        Double pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(66d, 45d);
        System.out.println("mul of pratyvalue is " + pratyvalue);

    }
    //praty
    public Double multiplicationByParameterAndReturnValue(Double a,Double b){
        Double w = a;
        Double x = b;
        Double z = a * b;
        return z;
    }

    //arti
    public Double multiplicationAndReturnValue() {
        Double a = 58d;
        Double b = 69d;
        Double c = a * b;
        return c;
    }

    //himans
    public void multiplicationByParameter(Double a, Double b) {
        Double d = a;
        Double e = b;
        Double f = d * e;
        System.out.println("parameter multiplication of two number is " + f);
    }


    //suraj
    public void multiplication() {
        Double a = 75d;
        Double b = 60d;
        Double c = a * b;
        System.out.println("mul of two number is " + c);
    }
}
