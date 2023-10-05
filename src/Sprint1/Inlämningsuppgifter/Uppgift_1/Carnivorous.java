package Sprint1.Inlämningsuppgifter.Uppgift_1;

import javax.swing.*;

public class Carnivorous extends Plants{ //Subklass för köttätande växter, ärver Plants

    private final FluidType fluidType = FluidType.PROTEINSUPPLEMENT; //fluidType definieras till proteindryck (från enum)

    //Konstruktor för Carnivorous. Ärver parametrarna från Plants
    public Carnivorous(String name, double height) {
        super(name, height);
    }


    public FluidType getFluidType() {   //Inkapsulering: getter för den privata konstanten fluidType
        return fluidType;
    }


    public double amountOfFluid() {     //Instansmetod för uträkningen av hur mycket vätska växtklassen behöver.
        return (0.1 + (0.2*getHeight()));
    }

    //
    @Override                           //Polymorfism: Metoden getInfo utför olika operationer beroende på vilken klass som objektet tillhör.
    public void getInfo() {
        JOptionPane.showMessageDialog(null, getName() + " behöver " + amountOfFluid() + " liter " + getFluidType().typeOfFluid + " per dag.");
    }
}
