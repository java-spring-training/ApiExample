package example.domain.entities.object;

import example.domain.value.object.ProductId;
import org.glassfish.jersey.internal.guava.Preconditions;
import org.springframework.util.StringUtils;

public class Product {

    private ProductId id;
    private String name;

    private Category category;

    public Product(ProductId id, String name) {

        Preconditions.checkArgument(StringUtils.hasText(name),
                "name must be not null");

        this.id = id;
        this.name = name;
    }

    public Product(ProductId id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}
