package example.controller;

import example.config.ApiConfig;
import example.config.WordPressProperties;
import example.domain.Product;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import example.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private Logger log = Logger.getLogger(ApiErrorHandler.class);

    private ProductService productService;
    private ProductResponseFactory factory;
    private ApiConfig apiConfig;
    private WordPressProperties wordPressProperties;

    @Autowired
    public ProductController(ProductService productService,
                             ProductResponseFactory factory,
                             ApiConfig apiConfig,
                             WordPressProperties wordPressProperties) {
        this.productService = productService;
        this.factory = factory;
        this.apiConfig = apiConfig;
        this.wordPressProperties = wordPressProperties;
    }

    @GetMapping("/list")
    public ProductResponse listAllProduct() {

        String name = apiConfig.getName();

        List<Product> productList = productService.getAll();
        return factory.toProductResponse(productList);
    }

    @GetMapping("/listWithRequestParameters")
    public ProductResponse listProductWithRequestParameters(
            @ModelAttribute ProductModelAttribute productModelAttribute) {

        log.info("API With Request Parameters");

        List<Product> productList = productService.getAll();
        return factory.toProductResponse(productList);
    }

    @PostMapping("/listWithRequestBody")
    public ProductResponse listWithRequestBody(
            @RequestBody ProductRequestBody productRequestBody) {

        log.info("API With Request Body");

        List<Product> productList = productService.getAll();
        return factory.toProductResponse(productList);
    }

    @GetMapping("/listWithRequestHeader")
    public ProductResponse listWithRequestHeader(
            @RequestHeader (name = "id") Integer id,
            @RequestHeader (name = "name") Integer name) {

        log.info("API With Request Header");

        List<Product> productList = productService.getAll();
        return factory.toProductResponse(productList);
    }

    @GetMapping("/listWithPathVariable/{id}/{name}")
    public ProductResponse listWithPathVariable(
            ProductRequest productRequest) {

        log.info("API With PathVariable");

        List<Product> productList = productService.getAll();
        return factory.toProductResponse(productList);
    }
}
