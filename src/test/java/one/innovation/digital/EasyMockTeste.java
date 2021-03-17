package one.innovation.digital;

import org.junit.Test;

import java.util.List;

import static org.easymock.EasyMock.*;

public class EasyMockTeste {
    @Test
    public void test() {
        List mock = createNiceMock(List.class);

        expect(mock.get(0)).andStubReturn("one");
        expect(mock.get(1)).andStubReturn("two");
        mock.clear();

        replay(mock);

        //someCodeThatInteractsWithMock();

        verify(mock);

    }
}
