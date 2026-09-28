package shauryax.MethodType;

public class SubIntTwoNumberUserMethod {

    public static void main(String[] args){
        int x = 990;
        int y = 122;
        int z = x - y;
        System.out.println("sub = "+ z);

        //subtraction();
        SubIntTwoNumberUserMethod subTwoNumber  = new SubIntTwoNumberUserMethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(89,49);

        int artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = "+ artivalue);

        int pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(100,200);
        System.out.println("sub of pratyvalue = "+ pratyvalue);

    }

    //suraj
    public void subtraction(){
        int a = 565;
        int b = 336;
        int c = a - b;
        System.out.println("subtraction of two number is "+ c);
    }

    //Himan
    public void subtractionByParameter(int a, int b){
        int d = a;
        int e = b;
        int f = a - b;
        System.out.println("parameter subtraction of two number is "+ f);
    }

    //arti
    public int subtractionAndReturnValue(){
        int a = 5;
        int b = 6;
        int c = a - b;
        return c;
    }

    //praty
    public int subtractionByParameterAndReturnValue(int u, int v){
        int w = u;
        int x = v;
        int y = w - x;
        return y;

    }
}


