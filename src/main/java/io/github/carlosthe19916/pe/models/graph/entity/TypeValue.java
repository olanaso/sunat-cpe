package io.github.carlosthe19916.pe.models.graph.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TypeValue {

    /**
     * The type value to use to represent this class.
     */
    String value();

}
