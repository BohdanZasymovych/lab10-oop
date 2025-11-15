package edu.ucu.ua.item;

public class RomashkaFlower extends Item {
    public RomashkaFlower() {
        description = "romashaka flower";
    }

    public boolean equals(Item other) {
        return other.description == description;
    }


    public double price() {return 10;}
}
