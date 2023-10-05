package Sprint1.Inlämningsuppgifter.Uppgift_1;

import javax.swing.*;

public class Cactus extends Plants{     //Subklass Cactus, ärver PLants

    private final FluidType fluidType = FluidType.MINERALWATER;     //fluidType definieras till mineralvatten (från enum)

    public Cactus(String name, double height) {     //Konstruktor för Cactus, ärver PLants
        super(name, height);
    }

    public FluidType getFluidType() {       //Inkapsulering, getter för fluidType för Cactus
        return fluidType;
    }

    @Override           //Polymorfism. Metoden getInfo utför olika operationer beroende på vilken klass som objektet tillhör.
    public void getInfo() {
        JOptionPane.showMessageDialog(null, getName() + " behöver 2 cl " + getFluidType().typeOfFluid + " per dag.");
    }
}
