package shauryax.Modulation;


public class MudIntegerNumberTest {

    public static void main(String[] args){

        MudIntegerNumber mudIntegerNumber = new MudIntegerNumber();
        MudIntegerNumber.MudIntegerNumber();
        Integer mud = MudIntegerNumber.modulationAndReturnValue();
        System.out.println("mud = " + mud);
        MudIntegerNumber.ModulationByParameter(22, 2);
        Integer total = MudIntegerNumber.modulationByParameterAndReturnValue(87, 23);
        System.out.println("total = " + total);
    }
}
