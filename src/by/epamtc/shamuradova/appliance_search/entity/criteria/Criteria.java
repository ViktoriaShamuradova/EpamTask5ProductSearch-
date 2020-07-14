package by.epamtc.shamuradova.appliance_search.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private String searchName;
    private Map<String, Object> criteria = new HashMap<>();

    public Criteria(String searchName) {
        this.searchName = searchName;
    }

    public String getSearchName() {

        return searchName;
    }

    public Map<String, Object> getCriteria() {

        return new HashMap<>(criteria);
    }

    public void add(String searchCriteria, Object value) {

        criteria.put(searchCriteria, value);
    }

}
