package exercices.tp1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exo2Test {
    Exo2 exo2;
    static float TVA;

    @BeforeAll
    public static void initAll() {
        TVA = 20;
    }

    @BeforeEach
    public void initEach() {
        exo2 = new Exo2();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(floats = {100})
    @DisplayName("Calcule prix TTC")
    public void testCalculateTtcPrice(float price) {
        assertEquals(120, Math.round(exo2.calculateTtcPrice(price)));
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(floats = {-150})
    @DisplayName("Calcule prix TTC avec prix négatif")
    public void testCalculateTtcPriceWithNegativePrice(float negativePrice) {
        assertThrows(IllegalArgumentException.class, () -> exo2.calculateTtcPrice(negativePrice));
    }
}