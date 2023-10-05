import Sprint1.Inlämningsuppgifter.Uppgift_1.Carnivorous;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {

    Carnivorous meatloaf = new Carnivorous("meatloaf", 0.7);
    @Test
    void amountOfFluid() {
        assert (0.1 + (0.2*meatloaf.getHeight()) == 0.24);
        assert (0.1 + (0.2*meatloaf.getHeight()) != 0.23);
        assert (0.1 + (0.2*meatloaf.getHeight()) != 0.25);
    }
}