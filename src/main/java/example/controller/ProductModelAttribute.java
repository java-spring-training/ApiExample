package example.controller;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;

public class ProductModelAttribute {

    /*@NotNull(message = "Id not null")*/
    @NotNull
    @Min(value = 0)
    private Integer id;

    @NotNull
    @Size(max = 10)
    @Pattern(regexp="[a-zA-Z]+")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
