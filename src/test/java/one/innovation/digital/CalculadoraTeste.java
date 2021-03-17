package one.innovation.digital;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTeste {
    @Test
    public void soma() {
        Calculadora calculadora = new Calculadora();
        int n = calculadora.soma("1+1+3"); // Resultado esperado: 5
        assertEquals(5, n);
    }

    @Test
    public void testeSomarComMock() {
        Calculadora calculadora = mock(Calculadora.class);
        when(calculadora.soma("1+2")).thenReturn(10);
        int resultado = calculadora.soma("1+2");
        assertEquals(10, resultado);
    }
}
