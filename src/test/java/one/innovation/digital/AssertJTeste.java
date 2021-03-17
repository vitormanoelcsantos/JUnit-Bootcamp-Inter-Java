package one.innovation.digital;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTeste {
    @Test
    public void checkEquality() {
        Pessoa pessoa = new Pessoa("Vitor", "Manoel");
//        Pessoa pessoaClone = pessoa;
        Pessoa pessoaClone = new Pessoa("Vitor", "Vitor");

        assertThat(pessoa).isEqualTo(pessoaClone);
    }
}
