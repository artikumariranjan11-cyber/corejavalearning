package shauryax.MethodType;

public class MulLongTwoNumberUserMethod {

    public static void main(String[] args) {

        Long x = 77L;
        Long y = 4L;
        Long z = x * y;
        System.out.println("mul = " + z);

        //multiplication();
        MulLongTwoNumberUserMethod mulTwoNumber = new MulLongTwoNumberUserMethod();;
        mulTwoNumber.multiplication();
        mulTwoNumber.multiplicationByParameter(62L, 9L);

        Long artivalue = mulTwoNumber.multiplicationAndReturnValue();
        System.out.println("mul of artivalue = " + artivalue);

        Long pratyvalue = mulTwoNumber.multiplicationByParameterAndReturnValue(666L, 4L);
        System.out.println("mul of pratyvalue is " + pratyvalue);

    }
    //praty
    public Long multiplicationByParameterAndReturnValue(Long a,Long b){
        Long w = a;
        Long x = b;
        Long z = a * b;
        return z;
    }

    //arti
    public Long multiplicationAndReturnValue() {
        Long a = 99L;
        Long b = 69L;
        Long c = a * b;
        return c;
    }

    //himans
    public void multiplicationByParameter(Long a, Long b) {
        Long d = a;
        Long e = b;
        Long f = d * e;
        System.out.println("parameter multiplication of two number is " + f);
    }


    //suraj
    public void multiplication() {
        Long a = 887L;
        Long b = 10L;
        Long c = a * b;
        System.out.println("mul of two number is " + c);
    }
}
