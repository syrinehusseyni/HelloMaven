package tn.enis.calcul;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculMetierTest {

    @Test
    public void testAddition() {
        CalculMetier metier = new CalculMetier();
        assertEquals(19, metier.addition(9, 10), 0.001);
    }

    @Test
    public void testMultiplication() {
        CalculMetier metier = new CalculMetier();
        assertEquals(90, metier.multiplication(9, 10), 0.001);
    }
}
