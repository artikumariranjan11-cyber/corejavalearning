package shauryax.MethodType;

public class AddfloatTwNumberUserMethod {
    public static void main(String[] args){
        float x = 98;
        float y = 45;
        float z = x + y;
        System.out.println("sum = "+ z);

        //addition();
        AddfloatTwNumberUserMethod addTwoNumber  = new AddfloatTwNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(28,19);

        float artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);

        float pratyvalue = addTwoNumber.additionByParameterAndReturnValue(655,876);
        System.out.println("sum of pratyvalue = "+ pratyvalue);

    }

    //suraj
    public void addition(){
        float a = 85;
        float b = 96;
        float c = a + b;
        System.out.println("addition of two number is "+ c);
    }

    //Himan
    public void additionByParameter(float a, float b){
        float d = a;
        float e = b;
        float f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }

    //arti
    public float additionAndReturnValue(){
        float a = 5;
        float b = 6;
        float c = a + b;
        return c;
    }

    //praty
    public float additionByParameterAndReturnValue(float u, float v){
        float w = u;
        float x = v;
        float y = w + x;
        return y;

    }
}
