package io.github.carlosthe19916.core.models.jpa;

import io.github.carlosthe19916.core.models.FacetModel;
import io.github.carlosthe19916.core.models.RangeModel;
import org.hibernate.search.query.facet.Facet;
import org.hibernate.search.query.facet.RangeFacet;
import io.github.carlosthe19916.core.models.FacetModel;
import io.github.carlosthe19916.core.models.RangeModel;

public class NumericRangeFacetAdapter implements FacetModel<RangeModel<Integer>> {

    private final Facet facet;

    public NumericRangeFacetAdapter(Facet facet) {
        this.facet = facet;
    }

    @Override
    public RangeModel<Integer> getValue() {
        RangeFacet<Integer> range = (RangeFacet<Integer>) facet;

        return new RangeModel<Integer>() {
            @Override
            public Integer getFrom() {
                return range.getMin();
            }

            @Override
            public Integer getTo() {
                return range.getMax();
            }
        };
    }

    @Override
    public int getCount() {
        return facet.getCount();
    }
}
