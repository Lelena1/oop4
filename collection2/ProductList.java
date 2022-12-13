package collection2;

import java.util.Set;

public class ProductList {
    private final Set<Product> products;

    public ProductList(Set<Product> products) {
        this.products = products;
    }


    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Продукт уже куплен");
        }
        products.add(product);
    }

    public void remove(Product product) {
        if (!products.contains(product)) {
            throw new IllegalArgumentException("Такого продукта в списке нет!");
        }
        products.remove(product);
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
