package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.loop.Counter.sum;

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
}