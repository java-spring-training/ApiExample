package example.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductsMapper implements RowMapper<ProductsModel> {

    @Override
    public ProductsModel mapRow(ResultSet resultSet, int  rowNum) throws SQLException {

        String productCode = resultSet.getString("productCode");
        String productName = resultSet.getString("productName");
        String productLine = resultSet.getString("productLine");
        String productScale = resultSet.getString("productScale");
        String productVendor = resultSet.getString("productVendor");
        String productDescription = resultSet.getString("productDescription");
        int quantityInStock = resultSet.getInt("quantityInStock");
        BigDecimal buyPrice = resultSet.getBigDecimal("buyPrice");
        BigDecimal msrp = resultSet.getBigDecimal("MSRP");

        return new ProductsModel(productCode, productName,
                productLine, productScale, productVendor, productDescription,
                quantityInStock, buyPrice, msrp);
    }
}
