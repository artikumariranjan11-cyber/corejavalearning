package shauryax.MethodType;

public class AddIntTwoNumberUserMethod {
    
    public static void main(String[] args) {

        int x = 20;
        int y = 21;
        int z = x + y;
        System.out.println("sum = " + z);

        //addition();
        AddIntTwoNumberUserMethod addTwoNumber = new AddIntTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(7, 8);

        int artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = " + artivalue);

        int pratyvalue = addTwoNumber.additionByParameterAndReturnValue(100, 200);
        System.out.println("sum of pratyvalue is " + pratyvalue);

    }
        //praty
        public int additionByParameterAndReturnValue(int a,int b){
            int w = a;
            int x = b;
            int z = a + b;
            return z;
        }

    //arti
    public int additionAndReturnValue() {
        int a = 5;
        int b = 6;
        int c = a + b;
        return c;
    }

    //himans
    public void additionByParameter(int a, int b) {
        int d = a;
        int e = b;
        int f = d + e;
        System.out.println("parameter addition of two number is " + f);
    }


    //suraj
    public void addition() {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("addition of two number is " + c);
    }
    }