package shauryax.MethodType;

public class SubIntegertwonumberusermethod {

    public static void main(String[] args){
        Integer x = 290;
        Integer y = 122;
        Integer z = x - y;
        System.out.println("sub = "+ z);

        //subtraction();
        SubIntTwoNumberUserMethod subTwoNumber  = new SubIntTwoNumberUserMethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(89,49);

        Integer artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = "+ artivalue);

        Integer pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(100,200);
        System.out.println("sub of pratyvalue = "+ pratyvalue);

    }

    //suraj
    public void subtraction(){
        Integer a = 565;
        Integer b = 336;
        Integer c = a - b;
        System.out.println("subtraction of two number is "+ c);
    }

    //Himan
    public void subtractionByParameter(Integer a, Integer b){
        Integer d = a;
        Integer e = b;
        Integer f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);
    }

    //arti
    public Integer subtractionAndReturnValue(){
        Integer a = 5;
        Integer b = 6;
        Integer c = a - b;
        return c;
    }

    //praty
    public Integer subtractionByParameterAndReturnValue(Integer u, Integer v){
        Integer w = u;
        Integer x = v;
        Integer y = w - x;
        return y;

    }
}
