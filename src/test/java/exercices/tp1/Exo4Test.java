package exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exo4Test {

    Exo4 exo4;

    @BeforeEach
    public void initEach() {
        exo4 = new Exo4();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource("argumentsCheckIfDoublon")
    public void checkIfDoublon(int[] numbers, boolean expected) {
        assertEquals(expected, exo4.checkIfDoublon(numbers));
    }

    private static Stream<Arguments> argumentsCheckIfDoublon() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 2, 3, 8}, false),
                Arguments.of((Object) new int[]{8, 3, 7, 8}, true)
        );
    }
}