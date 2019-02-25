package week8.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {

    private PowerLevelScouter powerLevelScouter = new PowerLevelScouter();
    String name = "Susana";

    @Test
    void scoutTest() {
        Integer expected = 619;
        Integer result = powerLevelScouter.scout(name);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void scoutEnhancedTest() {
        Integer expected = 651;
        Integer result = powerLevelScouter.scoutEnhanced(name);

        Assertions.assertEquals(expected, result);


    }

}