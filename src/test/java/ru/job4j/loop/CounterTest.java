package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.loop.Counter.sum;
import static ru.job4j.loop.Counter.sumByEven;

class CounterTest {

    @Test
    void whenStart0Finish10ThenSum15() {
        int sum = 0;
        int expected = 15;
        int output = sum(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8ThenSum15() {
        int sum = 0;
        int expected = 15;
        int output = sum(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1ThenSum15() {
        int sum = 0;
        int expected = 15;
        int output = sum(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish1ThenSum15() {
        int sum = 0;
        int expected = 0;
        int output = sum(3, 1);
        assertThat(output).isNotEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish1ThenSum15() {
        int sum = 0;
        int expected = 0;
        int output = sum(-3, 1);
        assertThat(output).isNotEqualTo(expected);
    }

    @Test
    void whenStart0Finish10ThenSumByEven30() {
        int sumEven = 0;
        int expected = 30;
        int output = sumByEven(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8ThenSumByEven30() {
        int sumEven = 0;
        int expected = 30;
        int output = sumByEven(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1ThenSumByEven30() {
        int sumEven = 0;
        int expected = 30;
        int output = sumByEven(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish1ThenSumByEven30() {
        int sumEven = 0;
        int expected = 30;
        int output = sumByEven(3, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish1ThenSumByEven30() {
        int sumEven = 0;
        int expected = 0;
        int output = sumByEven(-3, 1);
        assertThat(output).isNotEqualTo(expected);
    }
}