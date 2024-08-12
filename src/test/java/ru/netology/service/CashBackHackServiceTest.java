package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void shouldCalculateTheMissingAmount() {
        CashBackHackService service = new CashBackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotMissingQuantityIfAmountEqualBoundary(){
        CashBackHackService service = new CashBackHackService();
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMissingQuantityIfAmountMoreBoundary(){
        CashBackHackService service = new CashBackHackService();

        int amount = 1_001;
        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}