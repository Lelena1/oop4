package collection2;

import java.util.HashMap;
import java.util.Map;

public class TestProduct {
    public static void main(String[] args) {

        Map<Product, Double> products = new HashMap<>();
        Product mango = new Product("Манго", 150.50, 1.5);
        Product banana = new Product("Бананы", 100.50, 1.0);
        Product meat = new Product("Мясо", 485.00, 1.8);
        Product shugar = new Product("Сахар", 65, 1.100);
        Product pasta = new Product("Макароны", 79, 1.450);
        Product salt = new Product("Соль", 60, 1.005);
        Product tomatoes = new Product("Помидоры", 150, 1.4);

        Recipe desertMango = new Recipe("Десерт из манго");
        desertMango.add(mango);
        desertMango.add(shugar);
        System.out.println(desertMango.calculateTotalCostProducts());

        Recipe steak = new Recipe("Стейк");
        steak.add(meat);
        steak.add(salt);
        System.out.println(steak.calculateTotalCostProducts());

        Recipe desertBanana = new Recipe("Десерт из банана");
        desertBanana.add(banana);
        steak.add(shugar);
        System.out.println(steak.calculateTotalCostProducts());

        Recipe pastaBolognese = new Recipe("Паста Болоньез");
        pastaBolognese.add(pasta);
        pastaBolognese.add(meat);
        pastaBolognese.add(salt);
        pastaBolognese.add(tomatoes);
        System.out.println(pastaBolognese.calculateTotalCostProducts());

        Map<Recipe, Integer> resipes = new HashMap<>();
        resipes.put(desertMango, 230);
        resipes.put(desertBanana, 285);
        resipes.put(steak, 255);
        resipes.put(pastaBolognese, 535);
        System.out.println(resipes.toString());

    }
}