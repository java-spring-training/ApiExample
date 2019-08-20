package example.domain;

public class Product {

    private int id;
    private String productName;

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }
}
