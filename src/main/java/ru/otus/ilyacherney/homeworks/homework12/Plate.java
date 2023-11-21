package ru.otus.ilyacherney.homeworks.homework12;

public class Plate {
    int maxFoodAmount;
    int currentFoodAmount;

    public Plate(int foodAmountMax) {
        this.maxFoodAmount = foodAmountMax;
        this.currentFoodAmount = foodAmountMax;
    }

    public void addFood (int addingFoodAmount) {
        currentFoodAmount += addingFoodAmount;
        if (currentFoodAmount > maxFoodAmount) currentFoodAmount = maxFoodAmount;
    }

    public boolean takeFood (int takingFoodAmount) {
        if (currentFoodAmount - takingFoodAmount < 0) {
            currentFoodAmount = 0;
            return false;
        } else {
            currentFoodAmount -= takingFoodAmount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maxFoodAmount=" + maxFoodAmount +
                ", currentFoodAmount=" + currentFoodAmount +
                '}';
    }
}
