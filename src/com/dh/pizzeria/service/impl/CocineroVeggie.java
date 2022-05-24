package com.dh.pizzeria.service.impl;

import com.dh.pizzeria.service.Cocinero;

import java.util.logging.Logger;

public class CocineroVeggie extends Cocinero {

    private static final Logger logger=Logger.getLogger(String.valueOf(CocineroVeggie.class));
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate y diferentes quesos");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando quesos y tomate");

    }
    public int dividir(int a,int b){
        logger.info("soy una division");
        return a/b;
    }
}
