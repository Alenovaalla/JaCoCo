package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}

