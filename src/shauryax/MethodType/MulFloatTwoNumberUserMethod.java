package shauryax.MethodType;

public class MulFloatTwoNumberUserMethod {

    public static  void main(String[] args){

        Float x = 22f;
        Float y = 43f;
        Float z = x * y;
        System.out.println("mul = " + z);

        //multiplication();
        MulFloatTwoNumberUserMethod mulTwoNumber = new MulFloatTwoNumberUserMethod();
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicationByParameter(7f,8f);


        Float artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = " + artivalue);

        Float pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(66f, 45f);
        System.out.println("mul of pratyvalue is " + pratyvalue);

    }
    //praty
    public Float multiplicationByParameterAndReturnValue(Float a,Float b){
        Float w = a;
        Float x = b;
        Float z = a * b;
        return z;
    }

    //arti
    public Float multiplicationAndReturnValue(){
        Float a = 58f;
        Float b = 69f;
        Float c = a * b;
        return c;
    }

    //himans
    public void multiplicationByParameter(Float a, Float b){
        Float d = a;
        Float e = b;
        Float f = d * e;
        System.out.println("parameter multiplication of two number is " + f);
    }


    //suraj
    public void multiplication(){
        Float a = 75f;
        Float b = 60f;
        Float c = a * b;
        System.out.println("mul of two number is " + c);
    }
}
