package edu.ucu.ua.item.decorators;

import edu.ucu.ua.item.Item;

public class PaperDecorator extends AbstractDecorator {
    private static final double PAPER_PRICE = 13.0;

    public PaperDecorator(Item wrapped) {
        super(wrapped);
        this.description = wrapped.getDescription() + " + paper";
    }

    @Override
    public double price() {
        return wrapped.price() + PAPER_PRICE;
    }
}