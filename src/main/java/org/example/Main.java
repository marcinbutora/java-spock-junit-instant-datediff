package org.example;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main {

    public static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {
        Instant firstDate = Instant.parse("2023-01-26T16:29:00Z");
        Instant secondDate = Instant.parse("2023-02-15T10:00:00Z");
        long diffInDays = getDiffInDays(firstDate, secondDate);
        long diffInWeeks = getDiffInWeeks(diffInDays);
        System.out.println(diffInWeeks + " tygodni " + getNumberOfDays(diffInDays) + " dni");
    }

    static long getNumberOfDays(long diffInDays) {
        return diffInDays % DAYS_IN_WEEK;
    }

    static long getDiffInWeeks(long diffInDays) {
        return diffInDays / DAYS_IN_WEEK;
    }

    static long getDiffInDays(Instant firstDate, Instant secondDate) {
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }
}
