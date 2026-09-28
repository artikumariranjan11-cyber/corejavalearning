package shauryax.addition;

public class AddfloatNumbrTest {

    public static void main(String[] args){

        AddfloatNumbr addfloatNumbr = new AddfloatNumbr();
        addfloatNumbr.addition();
        float sum = addfloatNumbr.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addfloatNumbr.additionByParameter(987f, 2f);
        float total = addfloatNumbr.additionByParameterAndReturnValue(997f, 2f);
        System.out.println("total = " + total);
    }
}
