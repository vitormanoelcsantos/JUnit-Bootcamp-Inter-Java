package one.innovation.digital;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTeste {

    @Rule
    public TemporaryFolder Folder = new TemporaryFolder(); // Criando um diretório antes do teste.

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException { // Cria um arquivo no diretório.
        File file = Folder.newFile("file.txt");

        assertTrue(file.isFile()); // Testa se o arquivo foi criado.
        assertEquals(Folder.getRoot(), file.getParentFile()); // Testa se o arquivo criado está  de fato
                                                                    // dentro do diretório que criamos.
    }
}

