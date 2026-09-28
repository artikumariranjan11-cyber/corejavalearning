package shauryax.MethodType;

public class AddFloatTwoNumberUserMethod {
    public static void main(String[] args){
        Float x = 22.3f;
        Float y = 55.8f;
        Float z = x + y;
        System.out.println("sum = "+ z);

        //addition();
        AddFloatTwoNumberUserMethod addTwoNumber = new AddFloatTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(8f,6f);

        Float artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = "+ artivalue);


        Float pratyvalue = addTwoNumber.additionByParameterAndReturnValue(122f,22f);
        System.out.println("sum of pratyvalue = "+ pratyvalue);
    }
//suraj
    public void addition(){
        Float a = 33.3f;
        Float b = 43.2f;
        Float c = a + b;
        System.out.println("addition of two number is "+ c);
    }
    //himan
    public void additionByParameter(Float a , Float b){
        Float d = a;
        Float e = b;
        Float f = a + b;
        System.out.println("parameter addition of two number is "+ f);
    }
//arti
    public Float additionAndReturnValue(){
        Float a = 33.8f;
        Float b = 44.6f;
        Float c = a + b;
        return c;
    }
    //praty
    public
    Float additionByParameterAndReturnValue(Float u, Float v){
        Float w = u;
        Float x = v;
        Float y = w + x;
        return y;
    }
}
