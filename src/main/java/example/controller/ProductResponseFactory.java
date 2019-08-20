package example.controller;

import example.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductResponseFactory {

    public ProductResponse toProductResponse(List<Product> productList) {

        return new ProductResponse(productList);
    }
}
