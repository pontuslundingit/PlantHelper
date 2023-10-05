package Sprint1.Inlämningsuppgifter.Uppgift_1;

import javax.swing.*;

public class Palms extends Plants{ //Subklass för palmerna. Ärver från Plants.

    private final FluidType fluidType = FluidType.TAPWATER; //Sätter värdet fluidType till kranvatten (från enum)

    //Konstruktor för palms-objekt. Ärver namn och höjd som sätts från Plants konstruktor.
    public Palms(String name, double height) {
        super(name, height);
    }

    public FluidType getFluidType() { //Inkapsulering: Getter för den privata variabeln fluidType. Ger värdet av fluidType, = kranvatten.
        return fluidType;
    }

    public double amountOfFluid() { //Instansmetod som räknar ut hur mycket vätska som varje palm behöver, beroende på sin längd.
        return getHeight() * 0.5;
    }

    @Override //Polymorfism: Metoden getInfo utför olika operationer beroende på vilken klass som objektet tillhör.
    public void getInfo() {
        JOptionPane.showMessageDialog(null, getName() + " behöver " + amountOfFluid() + " liter " + getFluidType().typeOfFluid + " per dag.");
    }
}
