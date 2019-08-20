package example.controller;

import example.config.ApiConfig;
import example.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import example.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;
    private ProductResponseFactory factory;
    private ApiConfig apiConfig;

    @Autowired
    public ProductController(ProductService productService,
                             ProductResponseFactory factory,
                             ApiConfig apiConfig) {
        this.productService = productService;
        this.factory = factory;
        this.apiConfig = apiConfig;
    }

    @GetMapping("/list")
    public ProductResponse listAllProduct() {

        String name = apiConfig.getName();
        List<Product> productList = productService.getAll();
        return factory.toProductResponse(productList);
    }
}
