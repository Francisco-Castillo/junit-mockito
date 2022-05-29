/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fcastillo.junit;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Francisco Castillo
 */
public class BeerServiceStub implements BeerService {

    @Override
    public List<String> retrieveTodos(String beer) {
        return Arrays.asList("Quilmes", "Budweiser", "Corona", "Heineken",
                "Aguila");
    }

}
