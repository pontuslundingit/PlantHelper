package Sprint1.Inlämningsuppgifter.Uppgift_1;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    // Konstanter som håller värdet av mina meddelanden som ska visas i JOptionPane.
    String INPUT_PROMPT = "Vilken växt ska få vätska? (Lämna tomt fält -> Enter eller Cancel för att avsluta)";
    String CANCEL_MESSAGE = "Dialogen avbröts. Programmet avslutas...";
    String NOT_FOUND = "OOPS! \"%s\" hittades inte. Kontrollera växtens namn.";

    //Anropar min getInfo metod från Interface
    public void getInfo(Info info) {
        info.getInfo();
    }

    //Konstruktor för min Main-klass.
    Main() {

        //Skapar en arraylist där jag vill placera mina växter
        ArrayList<Plants> myPlants = new ArrayList<>();
        //Lägger till mina växter med parametrar enligt konstruktorn i Plants-klassen
        myPlants.add(new Cactus("Igge", 0.2));
        myPlants.add(new Palms("Laura", 5.0));
        myPlants.add(new Palms("Olof", 1.0));
        myPlants.add(new Carnivorous("Meatloaf", 0.7));

        while(true) {
            String requestedPlantName = JOptionPane.showInputDialog(null, INPUT_PROMPT); //Visar promptmeddelandet, sparar sedan värdet av input i variabel

            if (requestedPlantName == null || requestedPlantName.isEmpty()) {       //Om anv inte skriver in något avbryt och stäng program.
                JOptionPane.showMessageDialog(null, CANCEL_MESSAGE);
                break;
            }

            boolean plantFound = false;

            for (Plants plant : myPlants) {     //Itererar genom arraylist myPlants.
                if (plant.getName().equalsIgnoreCase(requestedPlantName)) {    //om man hittar ett namn som matchar, kör getInfo på den växten.
                    plantFound = true;
                    getInfo(plant);
                }
            }
                if (!plantFound){
                    JOptionPane.showMessageDialog(null, String.format(NOT_FOUND, requestedPlantName)); //hittas inte namn, visa meddelande och försök igen
                }
            }
        }

    public static void main(String[] args) {

        Main mainProgram = new Main();  //Skapar en instans av den egna klassen Main

    }
}


