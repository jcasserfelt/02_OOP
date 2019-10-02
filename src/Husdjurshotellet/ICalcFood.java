package Husdjurshotellet;

public interface ICalcFood {

    // diffrent formula for diffrent animals/sub classes
    // #Polymorfism
    int getFoodInGrams();

    // same method body for all animals, but depends on getFoodInGrams(), so..
    // #Polymorfism
    void showFoodMessage();
}
