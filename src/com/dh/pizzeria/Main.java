package com.dh.pizzeria;

import com.dh.pizzeria.service.Cocinero;
import com.dh.pizzeria.service.impl.CocineroNoVeggie;
import com.dh.pizzeria.service.impl.CocineroVeggie;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();
        cocineroVeggie.dividir(2,5);
    }


}
