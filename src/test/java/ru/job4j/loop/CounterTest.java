package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.loop.Counter.sum;
import static ru.job4j.loop.Counter.sumByEven;

class CounterTest {

    @Test
    void whenStart0Finish10ThenSum55() {
        int expected = 55;
        int output = sum(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8ThenSum33() {
        int expected = 33;
        int output = sum(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1ThenSum1() {
        int expected = 1;
        int output = sum(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish1ThenSum15() {
        int expected = 0;
        int output = sum(3, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish1ThenSum15() {
        int expected = 0;
        int output = sum(-3, 1);
        assertThat(output).isNotEqualTo(expected);
    }

    @Test
    void whenStart0Finish10ThenSumByEven30() {
        int expected = 30;
        int output = sumByEven(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8ThenSumByEven18() {
        int expected = 18;
        int output = sumByEven(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1ThenSumByEven0() {
        int expected = 0;
        int output = sumByEven(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish1ThenSumByEven0() {
        int expected = 0;
        int output = sumByEven(3, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish1ThenSumByEven30() {
        int expected = 0;
        int output = sumByEven(-3, 1);
        assertThat(output).isNotEqualTo(expected);
    }
}