package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumbersAreEqualThenReturnSame() {
        int result = Max.max(5, 5);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxFrom3NumbersThen3() {
        int result = Max.max(1, 2, 3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxFrom3NumbersMiddleIsMax() {
        int result = Max.max(1, 9, 3);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxFrom3NumbersFirstIsMax() {
        int result = Max.max(10, 3, 5);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxFrom4NumbersThenReturnMax() {
        int result = Max.max(2, 9, 4, 7);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAllFourEqualThenReturnThatNumber() {
        int result = Max.max(6, 6, 6, 6);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNegativeNumbersThenReturnMax() {
        int result = Max.max(-5, -2, -10, -3);
        int expected = -2;
        assertThat(result).isEqualTo(expected);
    }
}