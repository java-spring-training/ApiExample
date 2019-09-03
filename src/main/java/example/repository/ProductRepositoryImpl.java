package example.repository;

import example.domain.ProductRepository;
import example.domain.entities.object.Products;
import example.repository.mapper.ProductsModel;
import example.repository.mapper.ProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ProductRepositoryImpl extends JdbcDaoSupport implements ProductRepository {

    private ProductsMapper productsMapper;
    private ProductFactory productFactory;

    @Autowired
    public ProductRepositoryImpl(DataSource dataSource, ProductsMapper productsMapper, ProductFactory productFactory) {
        this.setDataSource(dataSource);
        this.productsMapper = productsMapper;
        this.productFactory = productFactory;
    }

    public List<Products> getAll() {

        String sql = "SELECT * FROM products LIMIT 10";

        List<ProductsModel> productsModelList = this.getJdbcTemplate().query(sql, productsMapper);

        // Get list data from DB
        /*return new ArrayList<>(Arrays.asList(
                        new Product(1, "Product 1"),
                        new Product(2, "Product 2"),
                        new Product(3, "Product 3")));*/

        return productFactory.toListProduct(productsModelList);
    }
}
