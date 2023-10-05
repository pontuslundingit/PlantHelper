import Sprint1.Inlämningsuppgifter.Uppgift_1.Palms;
import org.junit.jupiter.api.Test;

class PalmsTest {

    Palms laura = new Palms("Laura", 5.0);   //Skapar upp testobjekt för palmer. Här våra palmer laura och olof.
    Palms olof = new Palms("Olof", 1.0);


    @Test
    void amountOfFluid() {                      //Testar uträkningsmetoden i Palms
        assert (laura.getHeight()*0.5 == 2.5);  //Korrekt värde, 2.5.
        assert (laura.getHeight()*0.5 != 3.4);  //Random fel värde.

        assert (olof.getHeight()*0.5 == 0.5);
        assert (olof.getHeight()*0.5 != 1.5);
    }
}

