package shauryax.MethodType;

public class AddDoubleTwoNumberUserMethod {
    public static void main(String[] args) {

        Double x = 22d;
        Double y = 43d;
        Double z = x + y;
        System.out.println("sum = " + z);

        //addition();
        AddDoubleTwoNumberUserMethod addTwoNumber = new AddDoubleTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(72d, 98d);

        Double artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = " + artivalue);

        Double pratyvalue = addTwoNumber.additionByParameterAndReturnValue(66d, 45d);
        System.out.println("sum of pratyvalue is " + pratyvalue);

    }
    //praty
    public Double additionByParameterAndReturnValue(Double a,Double b){
        Double w = a;
        Double x = b;
        Double z = a + b;
        return z;
    }

    //arti
    public Double additionAndReturnValue() {
        Double a = 58d;
        Double b = 69d;
        Double c = a + b;
        return c;
    }

    //himans
    public void additionByParameter(Double a, Double b) {
        Double d = a;
        Double e = b;
        Double f = d + e;
        System.out.println("parameter addition of two number is " + f);
    }


    //suraj
    public void addition() {
        Double a = 75d;
        Double b = 60d;
        Double c = a + b;
        System.out.println("addition of two number is " + c);
    }
}
