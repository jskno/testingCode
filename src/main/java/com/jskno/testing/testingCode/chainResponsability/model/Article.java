package com.jskno.testing.testingCode.chainResponsability.model;

import java.util.Map;

public class Article {

    public Article(final String name, final Type type) {
        this.name = name;
        this.type = type;
    }

    private String name;
    private Type type;
    private Map<Feature, Status> status;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(final Type type) {
        this.type = type;
    }

    public Map<Feature, Status> getStatus() {
        return this.status;
    }

    public void setStatus(final Map<Feature, Status> status) {
        this.status = status;
    }
    
    public void addStatus(Feature feature, Status addStatus) {
        getStatus().put(feature, addStatus);
    }

}
