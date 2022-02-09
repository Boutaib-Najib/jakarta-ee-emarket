package ma.boutaib.ennassef.emarket.model;

import jakarta.annotation.PostConstruct;
import jakarta.faces.bean.ApplicationScoped;
import jakarta.faces.bean.ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@ApplicationScoped
public class CatalogManager implements Serializable {
    private ArrayList<Product> products;
    private int productId;
    private String productName;
    private double productPrice;

    public CatalogManager() {
        this.products = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String createProduct() {
        Product newProduct = new Product(this.getProductId(), this.getProductName(), this.getProductPrice());
        this.products.add(newProduct);
        return "productCreated";
    }

    @PostConstruct
    public void afterInit() {
        this.products.add(new Product(1, "HP", 999));
        this.products.add(new Product(2, "Dell", 799));
        this.products.add(new Product(3, "Asus", 899));
    }
}
