package example.repository;

import example.domain.entities.object.Products;
import example.domain.value.object.ProductCode;
import example.repository.mapper.ProductsModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductFactory {

    public List<Products> toListProduct(List<ProductsModel> productsModelList) {

        return productsModelList.stream().map(this::toProduct).collect(Collectors.toList());
    }

    private Products toProduct(ProductsModel productsModel) {

        ProductCode productCode = new ProductCode(productsModel.getProductCode());

        return new Products(productCode, productsModel.getProductName());
    }
}
