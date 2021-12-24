package me.bkkn.lesson14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task14ArrayClassTest {

        ArrayClass arrayClass = new ArrayClass();

        @BeforeAll
        static void init() {
            System.out.println("Начало тестов!");
        }

        @AfterAll
        static void end() {
            System.out.println("Конец тестов!");
        }


        @DisplayName("Первый тест с параметрами")
        @ParameterizedTest
        @MethodSource("data")
        void paramTest(int[] arrayIn, int[] arrayOut) {
            Assertions.assertArrayEquals(arrayClass.firstCheckArray(arrayOut), arrayIn);
        }

        static Stream<Arguments> data() {
            return Stream.of(
                    Arguments.arguments(new int[]{5, 6, 7, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                    Arguments.arguments(new int[]{5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                    Arguments.arguments(new int[]{5}, new int[]{1, 2, 3, 4, 5}),
                    Arguments.arguments(new int[]{8, 9, 6, 5, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 4, 8, 9, 6, 5, 8})
            );
        }


        @DisplayName("Второй тест с параметрами")
        @ParameterizedTest
        @MethodSource("data2")
        void paramTest2(int[] arrayIn, boolean out) {
            Assertions.assertEquals(arrayClass.secondCheckArray(arrayIn), out);
        }

        static Stream<Arguments> data2() {
            return Stream.of(
                    Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true),
                    Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}, false),
                    Arguments.arguments(new int[]{4, 4, 4, 4}, false),
                    Arguments.arguments(new int[]{1, 4, 4, 1, 1, 4, 3}, false)
            );
        }
}
