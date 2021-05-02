package com.github.TsygarovaIN.mavendemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-level testing for ImageComparator")
class ImageComparatorTest {
    private ImageComparator comparator = new ImageComparator();

    @Test
    public void shouldConfirmNumbersNotTheSame() {
        int number1 = 1;
        int number2 = 2;

        boolean result = comparator.isTheSameNumber(number1, number2);

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldConfirmNumbersTheSame() {
        int number = 1;

        boolean result = comparator.isTheSameNumber(number, number);

        Assertions.assertTrue(result);
    }
}