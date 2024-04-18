import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Filters.StrategyFilters;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<StrategyFilters> strategyFilters = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String consulta);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, StrategyFilters strategyFilter) {
        observers.add(queryObserver);
        strategyFilters.add(strategyFilter);
    }

    private void notifyAllObservers(String line) {
        for (int i = 0; i < observers.size(); i++) {
            QueryObserver obs = observers.get(i);
            StrategyFilters filter = strategyFilters.get(i);
            if (filter.interestingQuery(line)) {
                obs.onQuery(line);
            }
        }
    }
}
