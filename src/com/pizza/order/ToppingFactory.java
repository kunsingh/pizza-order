package com.pizza.order;

public class ToppingFactory {

    public Topping getTopping(final ToppingType toppingType) {
        if(toppingType == ToppingType.CAPSICUM) {
            return new CapsicumTopping();
        }
        if(toppingType == ToppingType.CHEESE) {
            return new CheeseTopping();
        }
        return null;
    }
}
