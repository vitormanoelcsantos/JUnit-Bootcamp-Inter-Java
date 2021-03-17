package one.innovation.digital;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoTeste {
    @Test
    public void test() {
        List mock = mock(List.class);

        when(mock.get(0)).thenReturn("one");
        when(mock.get(1)).thenReturn("two");

        //someCodeThatInteractsWithMock();

        verify(mock).clear();
    }
}
