package org.example;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class MainTestJUnit {
    @Test
    public void testGetDiffInDays() {
        // given
        Instant date1 = Instant.parse("2022-01-01T00:00:00Z");
        Instant date2 = Instant.parse("2022-01-15T00:00:00Z");
        long expected = 14;
        // when
        long result = Main.getDiffInDays(date1, date2);
        // then
        assertEquals(expected, result);
    }

    @Test
    public void testGetDiffInWeeks() {
        // given
        long diffInDays = 7;
        long expected = 1;
        // when
        long result = Main.getDiffInWeeks(diffInDays);
        // then
        assertEquals(expected, result);
    }

    @Test
    public void testGetNumberOfDays() {
        // given
        long diffInDays = 19;
        long expected = 5;
        // when
        long numberOfDays = Main.getNumberOfDays(diffInDays);
        // then
        assertEquals(expected, numberOfDays);
    }

}
