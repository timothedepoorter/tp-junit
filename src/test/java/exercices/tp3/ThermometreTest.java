package exercices.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThermometreTest {

    @Test
    public void should_return_0_when_array_empty() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {};
        assertEquals(0, thermometre.donneTemperature(temperatures));
    }

    @Test
    public void should_return_1_when_array_1_2_3() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {1, 2, 3};
        assertEquals(1, thermometre.donneTemperature(temperatures));
    }

    @Test
    public void should_return_neg2_when_array_neg2_neg8_4_5() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {-2, -8, 4, 5};
        assertEquals(-2, thermometre.donneTemperature(temperatures));
    }

    @Test
    public void should_return_2_when_array_contain_neg2_and_2() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = {-2, -8, -4, 2};
        assertEquals(2, thermometre.donneTemperature(temperatures));
    }

    @Test
    public void should_throw_exception_when_array_length_superior_10000() {
        Thermometre thermometre = new Thermometre();
        int[] temperatures = new int[10001];
        assertThrows(IllegalArgumentException.class, () -> thermometre.donneTemperature(temperatures));
    }
}
