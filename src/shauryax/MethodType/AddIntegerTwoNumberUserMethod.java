package shauryax.MethodType;

public class AddIntegerTwoNumberUserMethod {

    public static void main(String[] args){
        Integer x = 20;
        Integer y = 22;
        Integer z = x + y;
            System.out.println("sum = "+ z);

            //addition();
        AddIntTwoNumberUserMethod addTwoNumber  = new AddIntTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(8,9);
        Integer artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        Integer pratyvalue = addTwoNumber.additionByParameterAndReturnValue(100,200);
        System.out.println("sum of pratyvalue = "+ pratyvalue);

    }

    //suraj
    public void addition(){
        Integer a = 5;
        Integer b = 6;
        Integer c = a + b;
        System.out.println("addition of two number is "+ c);
    }

    //Himan
    public void additionByParameter(Integer a, Integer b){
        Integer d = a;
        Integer e = b;
        Integer f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public Integer additionAndReturnValue(){
        Integer a = 5;
        Integer b = 6;
        Integer c = a + b;
        return c;
    }

    //praty
    public Integer additionByParameterAndReturnValue(Integer u, Integer v){
        Integer w = u;
        Integer x = v;
        Integer y = w + x;
        return y;

    }
}
