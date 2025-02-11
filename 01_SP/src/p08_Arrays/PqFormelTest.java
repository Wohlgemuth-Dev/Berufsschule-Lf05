package p08_Arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Array-Längen werden bei assertArrayEquals() automatisch verglichen.
 */
class PqFormelTest {

    @ParameterizedTest
    @MethodSource("givenPQ_whenSolution_solutionOk")
	void givenPQ_whenSolution_solutionOk(double p, double q, double[] values) {
    	double[] solution = PQ_Formel_XL.berechnePQ(p, q);
		Arrays.sort(solution);
		Arrays.sort(values);
		assertArrayEquals(values, solution, "Lösungen nicht identisch.");
	}
    
    static Stream<Arguments> givenPQ_whenSolution_solutionOk() {
		return Stream.of(
				Arguments.of(1, 1, new double[] {}),
				Arguments.of(4, 16, new double[] {}),
				Arguments.of(-3, 5, new double[] {}),
				Arguments.of(-4, 7, new double[] {}),
				Arguments.of(4, 4, new double[] {-2}),
				Arguments.of(-4, 4, new double[] {2}),
				Arguments.of(8, 16, new double[] {-4}),
				Arguments.of(10, 25, new double[] {-5}),
				Arguments.of(6, -7, new double[] {-7, 1}),
				Arguments.of(4, -5, new double[] {-5, 1}),
				Arguments.of(-4, 3, new double[] {1, 3}),
				Arguments.of(6, 5, new double[] {-5, -1})
		);
    }

}
