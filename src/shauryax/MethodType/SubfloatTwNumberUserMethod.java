package shauryax.MethodType;

public class SubfloatTwNumberUserMethod {

    public static void main(String[] args){
    float x = 92.3f;
    float y = 45.8f;
    float z = x - y;
    System.out.println("sub = "+ z);

    //subtraction();
    SubFloatTwoNumberUserMethod subTwoNumber = new SubFloatTwoNumberUserMethod();
    subTwoNumber.subtraction();
    subTwoNumber.subtractionByParameter(98f,45f);

    float artivalue = subTwoNumber.subtractionAndReturnValue();
    System.out.println("sub of artivalue = "+ artivalue);


    float pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(566f,66f);
    System.out.println("sub of pratyvalue = "+ pratyvalue);
}
    //suraj
    public void subtraction(){
        float a = 3565f;
        float b = 3332f;
        float c = a - b;
        System.out.println("subtraction of two number is "+ c);

    }
    //himan
    public void subtractionByParameter(float a , float b){
        float d = a;
        float e = b;
        float f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);

    }
    //arti
    public float subtractionAndReturnValue(){
        float a = 757.6f;
        float b = 223.3f;
        float c = a - b;
        return c;

    }
    //praty
    public
    float subtractionByParameterAndReturnValue(float u, float v){
        float w = u;
        float x = v;
        float y = w - x;
        return y;
    }
}
