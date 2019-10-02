package Husdjurshotellet;

public interface ICalcFood {

    // diffrent formula for diffrent animals/sub classes
    int getFoodInGrams();

    // same method body for all animals, but depends on getFoodInGrams(), so..
    void showFoodMessage();
}
