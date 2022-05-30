package com.fcastillo.junit;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Francisco Castillo
 */
public class BeerServiceImplStubTest {

    @Test
    public void test() {
        // Stub o mock, es una dependencia falsa

        BeerService beerService = new BeerServiceStub();
        BeerServiceImpl beerServiceImpl = new BeerServiceImpl(beerService);

        List<String> filteredTodos = beerServiceImpl.retrieveTodosRelatedTo("Norte");

        assertEquals(1, filteredTodos.size());
    }

}
