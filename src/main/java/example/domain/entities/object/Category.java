package example.domain.entities.object;

import org.glassfish.jersey.internal.guava.Preconditions;
import org.springframework.util.StringUtils;

public class Category {

    private Category id;
    String name;

    public Category(Category id, String name) {

        Preconditions.checkArgument(StringUtils.hasText(name),
                "name must be not null");

        this.id = id;
        this.name = name;
    }
}
