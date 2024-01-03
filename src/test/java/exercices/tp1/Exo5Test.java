package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exo5Test {

    Exo5 exo5;

    @BeforeEach
    public void initEach() {
        exo5 = new Exo5();
    }
    @ParameterizedTest(name = "Test {index} : {0}")
    @CsvSource({
            "IV, 4",
            "XIX, 19",
            "XXXVIII, 38"
    })
    public void testConvertRomanNumIntoArabicNum(String romanNumber, int expected) {
        assertEquals(expected, exo5.convertRomanNumIntoArabicNum(romanNumber));
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(strings = {"XXXXXXXXXXXVVVVVVVIIIIIII", "XXXVVVVVVIIIIIIIIIIIIIIIIIIIIIII"})
    public void testConvertRomanNumIntoArabicNumWithMoreThan15Characters(String romanNumber) {
        assertThrows(IllegalArgumentException.class, () -> exo5.convertRomanNumIntoArabicNum(romanNumber));
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(strings = {"XVKI", "IV."})
    public void testConvertRomanNumIntoArabicNumWithNotValidRomanNumber(String romanNumber) {
        assertThrows(IllegalArgumentException.class, () -> exo5.convertRomanNumIntoArabicNum(romanNumber));
    }
}