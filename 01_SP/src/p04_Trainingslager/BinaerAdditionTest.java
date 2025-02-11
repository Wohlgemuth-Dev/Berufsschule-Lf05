package p04_Trainingslager;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaerAdditionTest {

    @ParameterizedTest
    @MethodSource("given2DualNumbers_addThem")
    void given2DualNumbers_addThem(int[] dual1, int[] dual2, int[] result) {
        int[] add = BinaerAddition.addiereDual(dual1, dual2);
        assertArrayEquals(add, result);
    }

    static Stream<Arguments> given2DualNumbers_addThem() {
        return Stream.of(
                // Kein �bertrag
                Arguments.of(new int[]{1,1,0,0}, new int[]{0,0,1,1}, new int[]{0,1,1,1,1}),
                // Einfacher �bertrag
                Arguments.of(new int[]{0,0,0,1}, new int[]{0,0,0,1}, new int[]{0,0,0,1,0}),
                // Doppelter �bertrag
                Arguments.of(new int[]{0,0,0,1}, new int[]{0,0,1,1}, new int[]{0,0,1,0,0}),
                // �bertrag auf 1. Stelle
                Arguments.of(new int[]{1,0,0,0}, new int[]{1,0,0,0}, new int[]{1,0,0,0,0}),
                // Multiple �bertr�ge
                Arguments.of(new int[]{1,1,0,1}, new int[]{1,0,1,1}, new int[]{1,1,0,0,0}),
                Arguments.of(new int[]{1,1,1,1}, new int[]{1,1,1,1}, new int[]{1,1,1,1,0})
        );
    }

}
