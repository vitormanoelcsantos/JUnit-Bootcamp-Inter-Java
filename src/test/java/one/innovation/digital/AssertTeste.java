package one.innovation.digital;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTeste {
    @Test
    public void testAssertArrayEquals() { // Compara os Arrays.
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals() { // Compara as Strings.
        assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse() { // Testa uma condição, um retorno booleano, um objeto ou um IF, por exemplo
                                    // para verificar se é verdadeiro.
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull() { // Testa para garantir que um objeto não está retornando Nulo.
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame() { // Compara os objetos e verificam se não são os mesmos.
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() { // Testa pra garantir que aquele objeto está Nulo.
        assertNull(null);
    }

    @Test
    public void testAssertSame() { // Testa para garantir que o objeto seja o mesmo.
        Integer aNumber = Integer.valueOf(6);
        assertSame(aNumber, aNumber);
    }
}
