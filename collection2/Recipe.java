package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Recipe {
    private final Map<Product, Double> products = new HashMap<>();
    private final String name;

    public Recipe(String name) {
        this.name = ValidateUtils.validateString(name);
    }

    public String getName() {
        return name;
    }

    public double calculateTotalCostProducts() {
        double totalCostProducts = 0.0;
        for (Map.Entry<Product,Double>product : products.entrySet()) {
            totalCostProducts += product.getKey().getAmount() * product.getKey().getPrice();
        }
        return totalCostProducts;
    }

    public void add(Product product) {
        if (this.products.containsKey(product)) {
            throw new IllegalArgumentException("Продукт уже куплен");
        }
        this.products.put(product, product.getAmount());
    }

    public void remove(Product product) {
        if (!this.products.containsKey(product)) {
            throw new IllegalArgumentException("Такого продукта в списке нет!");
        }
        products.remove(product);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "\nРецепт " + name + ", стоимость " + calculateTotalCostProducts() + " руб., порция (в граммах) ";
    }
}
