package collection2;

import java.util.Objects;

import static collection2.ValidateUtils.validateDouble;
import static collection2.ValidateUtils.validateString;

public class Product {
    private String name;
    private double price;
    private double amount;

    public Product(String name, double price, double amount) {
        this.name = validateString(name);
        this.price = validateDouble(price);
        this.amount = validateDouble(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateString(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = validateDouble(price);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = validateDouble(amount);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " по цене = " + price +
                " руб., " + amount +
                " кг.\n";
    }
}
