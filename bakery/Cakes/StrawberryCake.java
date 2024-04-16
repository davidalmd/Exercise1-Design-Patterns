package Cakes;

public class StrawberryCake extends Cake {

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }

    @Override
    public int getCost() {
        return super.getCost() * 2;
    }
    
}
