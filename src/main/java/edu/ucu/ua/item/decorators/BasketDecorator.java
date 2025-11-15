package edu.ucu.ua.item.decorators;

import edu.ucu.ua.item.Item;

public class BasketDecorator extends AbstractDecorator {
    private static final double BASKET_PRICE = 4.0;

    public BasketDecorator(Item wrapped) {
        super(wrapped);
        this.description = wrapped.getDescription() + " + basket";
    }

    @Override
    public double price() {
        return wrapped.price() + BASKET_PRICE;
    }
}