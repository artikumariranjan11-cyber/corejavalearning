package shauryax.MethodType;

public class MulIntTwoNumberUsermethod {

    public static void main(String[] args){
        int x = 678;
        int y = 88;
        int z = x * y;
        System.out.println("mul = "+ z);

        //multiplication();
        MulIntTwoNumberUsermethod mulTwoNumber  = new MulIntTwoNumberUsermethod();
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicartionByParameter(89,49);

        int artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = "+ artivalue);

        int pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(100,200);
        System.out.println("mul of pratyvalue = "+ pratyvalue);

    }

    int multiplicationAndReturnValue() {
        int a = 5;
        int b = 6;
        int c = a * b;
        return c;
    }

    void multiplicartionByParameter(int a, int b) {
        int d = a;
        int e = b;
        int f = a * b;
        System.out.println("parameter multiplication of two number is "+ f);
    }

    //suraj
    public void multiplication(){
        int a = 565;
        int b = 55;
        int c = a * b;
        System.out.println("multiplication of two number is "+ c);
    }


    //praty
    public int multiplicationByParameterAndReturnValue(int u, int v){
        int w = u;
        int x = v;
        int y = w * x;
        return y;

    }
}
