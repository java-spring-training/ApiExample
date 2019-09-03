package example.controller;

import example.domain.entities.object.Products;

import java.util.List;

public class ProductResponse {

    List<ProductResult> results;

    public ProductResponse(List<ProductResult> results) {
        this.results = results;
    }

    public List<ProductResult> getResults() {
        return results;
    }

    public void setResults(List<ProductResult> results) {
        this.results = results;
    }
}
