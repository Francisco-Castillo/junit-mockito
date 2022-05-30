package com.fcastillo.junit;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

/**
 *
 * @author Francisco Castillo
 */
@RunWith(MockitoJUnitRunner.class)
public class BeerServiceImplMockTest {

    @Test
    public void testUsingMock() {
        BeerService mockBeerService = mock(BeerService.class);
        List<String> todos = Arrays.asList("Quilmes", "Budweiser", "Corona", "Heineken",
                "Aguila");

        when(mockBeerService.retrieveTodos("Quilmes")).thenReturn(todos);

        BeerService beerService = new BeerServiceStub();
        BeerServiceImpl beerServiceImpl = new BeerServiceImpl(mockBeerService);

        List<String> filteredTodos = beerServiceImpl.retrieveTodosRelatedTo("Norte");

        assertEquals(1, filteredTodos.size());
    }

}
