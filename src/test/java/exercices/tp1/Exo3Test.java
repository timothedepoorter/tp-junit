package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {-11011})
    @DisplayName("Test de la méthode isPalindrome() avec un nombre négatif")
    public void testIsPalindromeWithNegativeNumber(int negativeNumber) {
        assertThrows(IllegalArgumentException.class, () -> exo3.isPalindrome(negativeNumber));
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {5})
    @DisplayName("Test de la méthode isPalindrome() avec un nombre composé d'un seul caractère")
    public void testIsPalindromeWithOneCharacterNumber(int oneCharacterNumber) {
        assertThrows(IllegalArgumentException.class, () -> exo3.isPalindrome(oneCharacterNumber));
    }
}