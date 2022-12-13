package collection2;
import java.util.Objects;

public final class Recipe {
    private final String name;
    private final double totalCost;
    private final ProductList productList;

    public Recipe(String name, double totalCost, ProductList productList) {
        this.name = ValidateUtils.validateString(name);
        this.totalCost = ValidateUtils.validateDouble(totalCost);
        this.productList = productList;

    }

    public String getName() {
        return name;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public ProductList getProductList() {
        return productList;
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
        return "Рецепт " + name + ", стоимость " + totalCost + ", ингредиенты и их стоимость (за кг) " + productList;
    }
}
