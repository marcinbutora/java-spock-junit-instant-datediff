package org.example

import spock.lang.Specification

import java.time.Instant

class MainTest extends Specification {
    def "test getDiffInDays"() {
        given:
        Instant firstDate = Instant.parse("2023-01-26T16:29:00Z")
        Instant secondDate = Instant.parse("2023-02-15T10:00:00Z")
        long expected = 19

        when:
        long diffInDays = Main.getDiffInDays(firstDate, secondDate)

        then:
        diffInDays == expected
    }

    def "test getDiffInWeeks"() {
        given:
        long diffInDays = 19
        long expected = 2

        when:
        long diffInWeeks = Main.getDiffInWeeks(diffInDays)

        then:
        diffInWeeks == expected
    }

    def "test getNumberOfDays"() {
        given:
        long diffInDays = 19
        long expected = 5

        when:
        long numberOfDays = Main.getNumberOfDays(diffInDays)

        then:
        numberOfDays == expected
    }
}
