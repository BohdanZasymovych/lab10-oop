package edu.ucu.ua.item;

public abstract class Item  {
    public String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();

    public abstract boolean equals(Item other);
}
