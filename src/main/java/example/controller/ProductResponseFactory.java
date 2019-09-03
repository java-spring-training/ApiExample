package example.controller;

import example.domain.entities.object.Products;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductResponseFactory {

    public ProductResponse toProductResponse(List<Products> productsList) {

        return new ProductResponse(toListProductResult(productsList));
    }

    public List<ProductResult> toListProductResult (List<Products> productsList) {

        return productsList.stream().map(this::toProductResult).collect(Collectors.toList());
    }

    private ProductResult toProductResult(Products products) {

        return new ProductResult(products.getProductCode().getProductCode(), products.getProductName());
    }

}
