package one.innovation.digital;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

public class MatcherTeste {
    @Test
    public void givenBean_checkToString(){ // Ele testa se a String gerada é a mesma da comparação. Validando-a
                                           // Esse tipo de validação é chamada de Object Matcher.
        Pessoa pessoa = new Pessoa("Vitor", "Manoel");
        String str = pessoa.toString();
        assertThat(pessoa, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists() { // Verifica se a classe possui a propriedade passada como
                                                  // parâmetro.
        Pessoa pessoa = new Pessoa("Vitor", "Manoel");
        assertThat(pessoa, HasProperty.hasProperty("nome"));
    }


    @Test
    public void givenCollection_checkEmpty() { // Verificar uma Lista de Colletcions e conferindo se ela está
                                               // vazia por exemplo.
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGreater() { // Verifica se o número é maior ou igual por exemplo.
        assertThat(1, Matchers.greaterThanOrEqualTo(1));
    }

//    @Test
//    public void givenString_checkNull() { // Verifica se a String é vazia ou nula.
//        String str = null;
//        assertThat(str, Matchers.emptyOrNullString());
//    }
}
