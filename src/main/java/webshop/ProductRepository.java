package webshop;

import org.mariadb.jdbc.MariaDbDataSource;

public class ProductRepository {
    private MariaDbDataSource dataSource;

    public ProductRepository(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    long insertProduct(String productName, int price, int stock){
        return 0L;
    }
    public Product findProductById(long id){
        return null;
    }

    public void updateProductStock(long id, int amount){

    }
}
