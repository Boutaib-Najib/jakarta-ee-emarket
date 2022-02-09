package ma.boutaib.ennassef.emarket.model;

import java.io.Serializable;

public class ShoppingCartItem implements Serializable {
    private int id;
    private int amount;
    private Product product;

    public ShoppingCartItem() {
    }

    public ShoppingCartItem(int id, int amount, Product product) {
        this.id = id;
        this.amount = amount;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
