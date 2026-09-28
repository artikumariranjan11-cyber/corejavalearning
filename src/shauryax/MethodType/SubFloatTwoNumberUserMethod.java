package shauryax.MethodType;

public class SubFloatTwoNumberUserMethod {
    public static void main(String[] args){
        Float x = 22.3f;
        Float y = 55.8f;
        Float z = x - y;
        System.out.println("sub = "+ z);

        //subtraction();
        SubFloatTwoNumberUserMethod subTwoNumber = new SubFloatTwoNumberUserMethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(88f,63f);

        Float artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = "+ artivalue);


        Float pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(122f,22f);
        System.out.println("sub of pratyvalue = "+ pratyvalue);
    }
    //suraj
    public void subtraction(){
        Float a = 33.3f;
        Float b = 43.2f;
        Float c = a - b;
        System.out.println("subtraction of two number is "+ c);
    }
    //himan
    public void subtractionByParameter(Float a , Float b){
        Float d = a;
        Float e = b;
        Float f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);
    }
    //arti
    public Float subtractionAndReturnValue(){
        Float a = 33.8f;
        Float b = 44.6f;
        Float c = a - b;
        return c;
    }
    //praty
    public
    Float subtractionByParameterAndReturnValue(Float u, Float v){
        Float w = u;
        Float x = v;
        Float y = w - x;
        return y;
    }
}
