package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.loop.Counter2JustForSum.sum;

class Counter2JustForSumTest {

    @Test
    void whenStart0Finish5ThenSum15() {
        int expected = 15;
        int output = sum(0, 5);
        assertThat(output).isEqualTo(expected);
    }

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
    void whenStart3Finish1ThenSum0() {
        int expected = 0;
        int output = sum(3, 1);
        assertThat(output).isEqualTo(expected);
    }
}