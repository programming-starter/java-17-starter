package me.parker;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingTest {

    @Test
    void english_short() {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(
                Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(fmt.format(10));
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }

    @Test
    void english_long() {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(
                Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(fmt.format(10));
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }

    @Test
    void korean_long() {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(
                Locale.KOREAN, NumberFormat.Style.LONG);
        System.out.println(fmt.format(10));
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }
}
