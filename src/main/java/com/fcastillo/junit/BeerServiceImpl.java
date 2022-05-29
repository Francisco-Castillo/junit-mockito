package com.fcastillo.junit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Castillo
 */
public class BeerServiceImpl {

    // BeerServiceImpl SUT (System Under Test)
    // BeerService es dependencia
    private BeerService beerService;

    public BeerServiceImpl(BeerService beerService) {
        this.beerService = beerService;
    }

    public List<String> retrieveTodosRelatedTo(String beer) {
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = beerService.retrieveTodos(beer);
        for (String todo : todos) {
            if (todo.contains("Quilmes")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
