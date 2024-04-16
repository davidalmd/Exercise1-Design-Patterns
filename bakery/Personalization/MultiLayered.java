package Personalization;

import Cakes.Cake;

public class MultiLayered extends PersonalizationDecorator {
    public MultiLayered(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return "Multi-layered "  + cake.getDescription();
    }

    @Override
    public int getCost() {
        return cake.getCost() + 5;
    }
    
}
