package shauryax.MethodType;

public class MulIntegerTwNumberUsermethod {
    public static <MulIntegerTwoNumberUsermethod> void main(String[] args){
        Integer x = 765;
        Integer y = 22;
        Integer z = x * y;
        System.out.println("mul = "+ z);

        //multiplication();
        MulIntTwoNumberUsermethod mulTwoNumber  = new MulIntTwoNumberUsermethod();
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicartionByParameter(22,49);

        Integer artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = "+ artivalue);

        Integer pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(900,500);
        System.out.println("mul of pratyvalue = "+ pratyvalue);


    }

    public void multiplicationByParameter(Integer a, Integer b) {
        Integer d = a;
        Integer e = b;
        Integer f = a * b;
        System.out.println("parameter multiplication of two number is "+ f);
    }

    public Integer multiplicationAndReturnValue() {
        Integer a = 995;
        Integer b = 16;
        Integer c = a * b;
        return c;
    }


    //suraj
    public void multiplication(){
        Integer a = 565;
        Integer b = 55;
        Integer c = a * b;
        System.out.println("multiplication of two number is "+ c);
    }


    //praty
    public Integer multiplicationByParameterAndReturnValue(Integer u, Integer v){
        Integer w = u;
        Integer x = v;
        Integer y = w * x;
        return y;

    }
}
