package helpers;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataForTests {
    public static Stream<Arguments> getNamesItems() {
        return Stream.of(
                Arguments.of("Republic of the Marshall Islands", 1L),
                Arguments.of("United States", 2L),
                Arguments.of("United States", 3L),
                Arguments.of("United States", 4L)
        );
    }
}
