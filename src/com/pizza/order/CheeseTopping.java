package com.pizza.order;

public class CheeseTopping implements Topping {

    private static final double price = 30.0;
    
    @Override
    public void addTopping(Pizza pizza) {
        System.out.println("Added cheese...");
    }

    @Override
    public double getPrice() {
        return price;
    }

}
