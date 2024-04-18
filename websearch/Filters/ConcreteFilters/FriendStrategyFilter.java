package Filters.ConcreteFilters;
import Filters.StrategyFilters;

public class FriendStrategyFilter implements StrategyFilters {
    
    @Override
    public boolean interestingQuery(String consulta) {
        return consulta.toLowerCase().contains("friend");
    }
}
