package example.controller;

import example.domain.Product;

import java.util.List;

public class ProductResponse {

    List<Product> results;

    public ProductResponse(List<Product> results) {
        this.results = results;
    }

    public List<Product> getResults() {
        return results;
    }

    public void setResults(List<Product> results) {
        this.results = results;
    }
}
