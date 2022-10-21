package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @ParameterizedTest
    @MethodSource("testCases")
    public void testFactorial(String in, String expected) {
        assertEquals(expected, factorial.factorial(in));
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("4", "24"),
                Arguments.of("10", "3628800"),
                Arguments.of("6", "720"),
                Arguments.of("13", "6227020800")
        );
    }
}
