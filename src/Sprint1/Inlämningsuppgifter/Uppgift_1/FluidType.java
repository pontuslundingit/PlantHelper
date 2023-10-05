package Sprint1.Inlämningsuppgifter.Uppgift_1;

public enum FluidType {  //Namn på min enum-klass
    MINERALWATER ("mineralvatten"),  //I versaler instansieras enum, och det associeras med String "mineralvatten"
    TAPWATER ("kranvatten"),
    PROTEINSUPPLEMENT ("proteindryck");

    public String typeOfFluid;  //Instansvariabel av enum. Fråga: IDE vill göra variabeln final, men är inte det onödigt då enum är konstanter?

    FluidType(String s) {           //Konstruktor för enum. Behövs här för att kunna associera.
        typeOfFluid = s;
        }

}
