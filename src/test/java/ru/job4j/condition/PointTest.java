package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when0to0to3then2() {
        Point c = new Point(0, 0, 3);
        Point d = new Point(0, 2, 3);
        double expected = 2.0;
        double output = c.distance3d(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when0to1to0then1() {
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double expected = 1.0;
        double output = c.distance3d(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}