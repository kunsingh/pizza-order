package com.pizza.order;

public class CapsicumTopping implements Topping {

    private static final double price = 20.0;
    
    @Override
    public void addTopping(Pizza pizza) {
        System.out.println("Added capsicum...");

    }

    @Override
    public double getPrice() {
        return price;
    }

}
