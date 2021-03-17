package one.innovation.digital;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTeste {
    @Test
    public void sum() {
        Calculadora calculadora = new Calculadora();
        int n = calculadora.sum("1+1+3"); // Resultado esperado: 5
        assertEquals(5, n);
    }
}
