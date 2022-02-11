package ma.boutaib.ennassef.emarket.model;

import jakarta.annotation.PostConstruct;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class ShoppingCartManager implements Serializable {
    private ArrayList<ShoppingCartItem> items;
    private Product toAdd;

    public ShoppingCartManager() {
        this.items = new ArrayList<ShoppingCartItem>();
    }

    public ArrayList<ShoppingCartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ShoppingCartItem> items) {
        this.items = items;
    }

    @PostConstruct
    public void postInit() {
        Product p = new Product(10, "Samsung", 149);
        ShoppingCartItem item = new ShoppingCartItem(1, 2, p);

        this.items.add(item);
    }

    public Product getToAdd() {
        return toAdd;
    }

    public void setToAdd(Product toAdd) {
        this.toAdd = toAdd;
    }

    public void addToCart() {
        ShoppingCartItem itemFound = this.items.stream().filter(
                cartItem -> cartItem.getProduct().getId() == this.toAdd.getId()
        ).findFirst().orElse(null);

        if (itemFound == null) {
            this.items.add(new ShoppingCartItem(1, 1, this.toAdd));
        } else {
            itemFound.setAmount(itemFound.getAmount() + 1);
        }
    }

    public double totalPrice() {
        double total = 0;
        for (ShoppingCartItem item : this.items) {
            total = total + item.getProduct().getPrice() * item.getAmount();
        }

        return total;
    }
}
