package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecursiveMethodsTest {

    private RecursiveMethods recursiveMethods;

    @BeforeEach
    void setUp() {
        recursiveMethods = new RecursiveMethods();
    }

    @Test
    void testExercise1() {
        Assertions.assertThat(recursiveMethods.sumFirstNumbers(7)).isEqualTo(28);
        Assertions.assertThat(recursiveMethods.sumFirstNumbers(0)).isEqualTo(0);
        Assertions.assertThat(recursiveMethods.sumFirstNumbers(1)).isEqualTo(1);
    }

    @Test
    void testExercise1Exception() {
        boolean thrown = false;
        try {
            recursiveMethods.sumFirstNumbers(-1);
        } catch (StackOverflowError e) {
            thrown = true;
        }
        Assertions.assertThat(thrown).isTrue();
    }

    @Test
    void testExercise2() {
        Assertions.assertThat(recursiveMethods.sumFirstEvenNumbers(12)).isEqualTo(42);
        Assertions.assertThat(recursiveMethods.sumFirstEvenNumbers(11)).isEqualTo(30);
        Assertions.assertThat(recursiveMethods.sumFirstEvenNumbers(3)).isEqualTo(2);
        Assertions.assertThat(recursiveMethods.sumFirstEvenNumbers(2)).isEqualTo(2);
        Assertions.assertThat(recursiveMethods.sumFirstEvenNumbers(1)).isEqualTo(0);
        Assertions.assertThat(recursiveMethods.sumFirstEvenNumbers(0)).isEqualTo(0);
    }

    @Test
    void testExercise2Exception() {
        boolean thrown = false;
        try {
            recursiveMethods.sumFirstEvenNumbers(-1);
        } catch (StackOverflowError e) {
            thrown = true;
        }
        Assertions.assertThat(thrown).isTrue();
    }

    @Test
    void testExercise3() {
        Assertions.assertThat(recursiveMethods.palindrome("wowow")).isTrue();
        Assertions.assertThat(recursiveMethods.palindrome("stuff")).isFalse();
    }

    @Test
    void testExercise3Exception() {
        try {
            org.junit.jupiter.api.Assertions.assertTrue(recursiveMethods.palindrome(null));
        } catch (NullPointerException e) {

        }
    }

    @Test
    void testExercise4() {
        Assertions.assertThat(recursiveMethods.sumOfDigits(219587)).isEqualTo(32);
        Assertions.assertThat(recursiveMethods.sumOfDigits(0)).isEqualTo(0);
        Assertions.assertThat(recursiveMethods.sumOfDigits(-1357)).isEqualTo(-16);
    }

    @Test
    void testExercise5() {
        Assertions.assertThat(recursiveMethods.fibonacciSeries(1)).isEqualTo(0);
        Assertions.assertThat(recursiveMethods.fibonacciSeries(2)).isEqualTo(1);
        Assertions.assertThat(recursiveMethods.fibonacciSeries(3)).isEqualTo(1);
        Assertions.assertThat(recursiveMethods.fibonacciSeries(4)).isEqualTo(2);
        Assertions.assertThat(recursiveMethods.fibonacciSeries(5)).isEqualTo(3);
        Assertions.assertThat(recursiveMethods.fibonacciSeries(10)).isEqualTo(34);
    }

    @Test
    void testExercise5Exception() {
        boolean thrown = false;
        try {
            recursiveMethods.fibonacciSeries(0);
            recursiveMethods.fibonacciSeries(-1);
        } catch (StackOverflowError e) {
            thrown = true;
        }
        Assertions.assertThat(thrown).isTrue();
    }
}
