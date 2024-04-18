package Filters.ConcreteFilters;
import Filters.StrategyFilters;

public class LengthStrategyFilter implements StrategyFilters {
    private final int maxLength;

    public LengthStrategyFilter(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean interestingQuery(String consulta) {
        return consulta.length() > maxLength;
    }
}
