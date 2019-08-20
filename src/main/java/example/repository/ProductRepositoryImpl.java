package example.repository;

import example.domain.Product;
import example.domain.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    public List<Product> getAll() {

        // Get list data from DB
        return new ArrayList<>(Arrays.asList(
                        new Product(1, "Product 1"),
                        new Product(2, "Product 2"),
                        new Product(3, "Product 3")));
    }
}
