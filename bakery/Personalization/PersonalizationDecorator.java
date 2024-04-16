package Personalization;
import Cakes.Cake;

public abstract class PersonalizationDecorator extends Cake {
    protected Cake cake;

    @Override
    public abstract int getCost();
}
