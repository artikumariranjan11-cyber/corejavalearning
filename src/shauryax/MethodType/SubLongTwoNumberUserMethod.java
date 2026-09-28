package shauryax.MethodType;

public class SubLongTwoNumberUserMethod {

    public static void main(String[] args) {

        Long x = 566L;
        Long y = 324L;
        Long z = x - y;
        System.out.println("sub = " + z);

        //subtraction();
        SubLongTwoNumberUserMethod subTwoNumber = new SubLongTwoNumberUserMethod();
        subTwoNumber.subtraction();
        subTwoNumber.subtractionByParameter(765L, 233L);

        Long artivalue = subTwoNumber.subtractionAndReturnValue();
        System.out.println("sub of artivalue = " + artivalue);

        Long pratyvalue = subTwoNumber.subtractionByParameterAndReturnValue(987L, 660L);
        System.out.println("sub of pratyvalue is " + pratyvalue);

    }
    //praty
    public Long subtractionByParameterAndReturnValue(Long a,Long b){
        Long w = a;
        Long x = b;
        Long z = a - b;
        return z;
    }

    //arti
    public Long subtractionAndReturnValue() {
        Long a = 576L;
        Long b = 232L;
        Long c = a - b;
        return c;
    }

    //himans
    public void subtractionByParameter(Long a, Long b) {
        Long d = a;
        Long e = b;
        Long f = d - e;
        System.out.println("parameter subtraction of two number is " + f);
    }


    //suraj
    public void subtraction() {
        Long a = 325L;
        Long b = 126L;
        Long c = a - b;
        System.out.println("subtraction of two number is " + c);
    }
}
