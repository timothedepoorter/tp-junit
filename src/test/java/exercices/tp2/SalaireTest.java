package exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaireTest {
    Salaire salaire;
    @BeforeEach
    public void setUpEach() {
       salaire = new Salaire(11.25);
    }
    @ParameterizedTest(name = "Test {index} : {0}")
    @CsvSource({
            "151, 1698.75",
            "157, 1783.13"
    })
    @DisplayName("Méthode payer()")
    public void testPayer(int heures, double expected) {
        assertEquals(expected, salaire.payer(heures));
    }
}