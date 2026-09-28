package shauryax.addition;

public class AddLongNumberTest {

    public static void main(String[] args){

        AddLongNumber addLongNumber = new AddLongNumber();
        addLongNumber.addition();
        Long sum = addLongNumber.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addLongNumber.additionByParameter(667L, 356L);
        Long total = addLongNumber.additionByParameterAndReturnValue(877L, 332L);
        System.out.println("total = " + total);
    }
}
