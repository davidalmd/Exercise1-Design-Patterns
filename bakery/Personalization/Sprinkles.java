package Personalization;

import Cakes.Cake;

public class Sprinkles extends PersonalizationDecorator {
    public Sprinkles(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }

    @Override
    public int getCost() {
        return cake.getCost() + 2;
    }
}
