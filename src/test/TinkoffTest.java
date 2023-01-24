package test;

import Examples.Tinkoff;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinkoffTest {

    @Test
    public void testTinkoff() {
        assertEquals (21, Tinkoff.calculateDeposit(6));
        assertEquals (37, Tinkoff.calculateDeposit(10));
        assertEquals (63, Tinkoff.calculateDeposit(14));
        assertEquals (70, Tinkoff.calculateDeposit(16));
        assertEquals (74926, Tinkoff.calculateDeposit(1000));
    }

}