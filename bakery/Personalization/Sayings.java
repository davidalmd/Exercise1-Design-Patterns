package Personalization;

import Cakes.Cake;

public class Sayings extends PersonalizationDecorator {

    private String saying;

    public Sayings(Cake cake, String saying) {
        this.cake = cake;
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying " + '"' + saying + '"';
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }
}
