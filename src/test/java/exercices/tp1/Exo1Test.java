package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exo1Test {

    Exo1 exo1;

    @BeforeEach
    public void initEach() {
        exo1 = new Exo1();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource("argumentsCalculateAverageOfNumbers")
    public void testCalculateAverageOfNumbers(int[] notes, int expected) {
        assertEquals(expected, exo1.calculateAverageOfNumbers(notes));
    }

    private static Stream<Arguments> argumentsCalculateAverageOfNumbers() {
        return Stream.of(
                Arguments.of((Object) new int[]{5, 10, 15}, 10),
                Arguments.of((Object) new int[]{8, 20, 15}, 14)
        );
    }
}