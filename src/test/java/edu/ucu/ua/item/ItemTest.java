package edu.ucu.ua.item;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void testRomashkaFlowerPrice() {
        RomashkaFlower flower = new RomashkaFlower();
        assertEquals(10.0, flower.price());
    }

    @Test
    void testRomashkaFlowerDescription() {
        RomashkaFlower flower = new RomashkaFlower();
        assertEquals("romashaka flower", flower.getDescription());
    }

    @Test
    void testCactusFlowerPrice() {
        CactusFlower flower = new CactusFlower();
        assertEquals(13.0, flower.price());
    }

    @Test
    void testCactusFlowerDescription() {
        CactusFlower flower = new CactusFlower();
        assertEquals("cactus flower", flower.getDescription());
    }

    @Test
    void testFlowerBucketPrice() {
        FlowerBucket bucket = new FlowerBucket();
        assertEquals(20.0, bucket.price());
    }

    @Test
    void testFlowerBucketDescription() {
        FlowerBucket bucket = new FlowerBucket();
        assertEquals("flower bucket", bucket.getDescription());
    }

    @Test
    void testItemsEquality() {
        RomashkaFlower flower1 = new RomashkaFlower();
        RomashkaFlower flower2 = new RomashkaFlower();
        assertTrue(flower1.equals(flower2));
    }

    @Test
    void testItemsNotEqual() {
        RomashkaFlower romashka = new RomashkaFlower();
        CactusFlower cactus = new CactusFlower();
        assertFalse(romashka.equals(cactus));
    }
}
