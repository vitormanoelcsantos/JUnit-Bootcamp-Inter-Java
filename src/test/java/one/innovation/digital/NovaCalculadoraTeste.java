package one.innovation.digital;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NovaCalculadoraTeste {
    @Test
    public void deveSomarDoisValores() {
        int valorA = 1;
        int valorB = 2;

        Calculadora calc = new Calculadora();
        int soma = calc.novaSoma(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void deveSomarTresValores() {
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        Calculadora calc = new Calculadora();
        int soma = calc.novaSoma(valorA, valorB, valorC);

        assertEquals(6, soma);
    }
}
