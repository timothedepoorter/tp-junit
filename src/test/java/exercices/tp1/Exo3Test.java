package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exo3Test {
    Exo3 exo3;
    @BeforeEach
    public void initEach() {
        exo3 = new Exo3();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @CsvSource({
            "123456789, false",
            "123454321, true"
    })
    @DisplayName("Test de la méthode isPalindrome()")
    public void testIsPalindrome(int numberToTest, boolean expected) {
        assertEquals(expected, exo3.isPalindrome(numberToTest));
    }
}