package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainAmount() {
        int amount = 1500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNegativeCheckRemainAmount() {
        int amount = 1500;
        int expected = 600;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertNotEquals(actual, expected);
    }

    @Test
    public void should_Remain_when_AmountIs1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void should_Remain_when_Amount_is_less_1000() {
        int amount = 700;
        int expected = 300;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}