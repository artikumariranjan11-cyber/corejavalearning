package shauryax.MethodType;

public class AddLongTwoNumberUserMethod {
    public static void main(String[] args) {

        Long x = 20L;
        Long y = 21L;
        Long z = x + y;
        System.out.println("sum = " + z);

        //addition();
        AddLongTwoNumberUserMethod addTwoNumber = new AddLongTwoNumberUserMethod();
        addTwoNumber.addition();
        addTwoNumber.additionByParameter(88L, 87L);

        Long artivalue = addTwoNumber.additionAndReturnValue();
        System.out.println("sum of artivalue = " + artivalue);

        Long pratyvalue = addTwoNumber.additionByParameterAndReturnValue(433L, 870L);
        System.out.println("sum of pratyvalue is " + pratyvalue);

    }
    //praty
    public Long additionByParameterAndReturnValue(Long a,Long b){
        Long w = a;
        Long x = b;
        Long z = a + b;
        return z;
    }

    //arti
    public Long additionAndReturnValue() {
        Long a = 59L;
        Long b = 66L;
        Long c = a + b;
        return c;
    }

    //himans
    public void additionByParameter(Long a, Long b) {
        Long d = a;
        Long e = b;
        Long f = d + e;
        System.out.println("parameter addition of two number is " + f);
    }


    //suraj
    public void addition() {
        Long a = 59L;
        Long b = 60L;
        Long c = a + b;
        System.out.println("addition of two number is " + c);
    }
}
