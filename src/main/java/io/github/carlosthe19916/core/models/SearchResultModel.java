package io.github.carlosthe19916.core.models;

import java.util.List;
import java.util.Map;

public interface SearchResultModel<T> {

    List<T> getItems();

    int getTotalResults();

    Map<String, List<FacetModel>> getFacets();

}
