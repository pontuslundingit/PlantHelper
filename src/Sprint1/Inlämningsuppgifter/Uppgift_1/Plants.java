package Sprint1.Inlämningsuppgifter.Uppgift_1;

public abstract class Plants implements Info {  // Plants implementerar allt som finns i Info-interface.

    private String name; //Inkapsulering: variablerna name och height är private, så de inte kan nås utanför den egna klassen.
    private double height;


    public Plants(String name, double height) {  //Konstruktor för object Plants.
        this.name = name;
        this.height = height;
    }

    public abstract void getInfo(); //Interface är alltid abstract så metoden behöver också vara det i Plants, alternativt ha en "kropp"

    public double getHeight() {         //Inkapsulering: getter för objektets height, då den är privat.
        return height;
    }

    public String getName() {           //Inkapsulering: Samma som ovan, för objektets namn.
        return name;
    }

}
