package shauryax.addition;

public class AddlongNumbrTest {

    public static void main(String[] args){

        AddlongNumbr addlongNumbr = new AddlongNumbr();
        addlongNumbr.addition();
        long sum = addlongNumbr.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addlongNumbr.additionByParameter(787l, 356l);
        long total = addlongNumbr.additionByParameterAndReturnValue(899l, 442l);
        System.out.println("total = " + total);
    }
}
