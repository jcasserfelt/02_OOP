package Husdjurshotellet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KattTest extends DäggDjur {
    Katt kt = new Katt("namn", 5);

    @Test
    void testGetFoodInGrams() {
        assertTrue(kt.getFoodInGrams() == kt.getVikt() * 1000 / 150);
        assertTrue(kt.getVikt() != 10);
    }

    @Test
    void testShowFoodMessage() {
    }

    @Override
    public int getFoodInGrams() {
        return 0;
    }

    @Override
    public void showFoodMessage() {

    }
}