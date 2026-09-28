package shauryax.MethodType;

public class MulfloatTwNumberUserMethod {

    public static  void main(String[] args){

        float x = 22f;
        float y = 43f;
        float z = x * y;
        System.out.println("mul = " + z);

        //multiplication();
        MulfloatTwNumberUserMethod mulTwoNumber = new MulfloatTwNumberUserMethod();
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicationByParameter(27f,18f);


        float artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = " + artivalue);

        float pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(66f, 45f);
        System.out.println("mul of pratyvalue is " + pratyvalue);

    }
    //praty
    public float multiplicationByParameterAndReturnValue(float a,float b){
        float w = a;
        float x = b;
        float z = a * b;
        return z;
    }

    //arti
    public float multiplicationAndReturnValue(){
        float a = 58f;
        float b = 69f;
        float c = a * b;
        return c;
    }

    //himans
    public void multiplicationByParameter(float a, float b){
        float d = a;
        float e = b;
        float f = d * e;
        System.out.println("parameter multiplication of two number is " + f);
    }


    //suraj
    public void multiplication(){
        float a = 75f;
        float b = 60f;
        float c = a * b;
        System.out.println("mul of two number is " + c);
    }
}
