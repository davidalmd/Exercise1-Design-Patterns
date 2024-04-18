import Filters.StrategyFilters;
import Filters.ConcreteFilters.FriendStrategyFilter;
import Filters.ConcreteFilters.LengthStrategyFilter;

/**
 * Watches the search queries
 */
public class Snooper {

    public Snooper(WebSearchModel model) {
        StrategyFilters friendFilter = new FriendStrategyFilter();
        StrategyFilters lengthFilter = new LengthStrategyFilter(60);

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String consulta) {
                System.out.println("Oh Yes! " + consulta);
            }
        }, friendFilter);

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String consulta) {
                System.out.println("So long... " + consulta);
            }
        }, lengthFilter);
    }
}
