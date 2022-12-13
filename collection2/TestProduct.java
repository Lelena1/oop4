package collection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class TestProduct {
    public static void main(String[] args) {
        doTask1_1();
        doTask2_1();
        doTask2_2();
    }
//        Recipe pastaBolonjese = new Recipe("Паста Болоньез", 255.35, "1");

//        Set<String> recipe = new HashSet<>();
//        recipe.add(pasta(0.2, 0.79), tomatoes);
//        System.out.println(Arrays.toString(recipe.toArray()));

    //    }
    public static void doTask1_1() {
        System.out.println("ДЗ 1 задание 1:");
        Set<Product> products = new HashSet<>();
        products.add(new Product("Манго", 150.50, 1.5));
        products.add(new Product("Бананы", 100.50, 1.0));
        products.add(new Product("Колбаса", 750.30, 0.5));
        products.add(new Product("Мясо", 485.00, 0.8));
        products.add(new Product("Сахар", 65, 0.900));
        products.add(new Product("Макароны", 79, 0.450));
        products.add(new Product("Свекла", 40, 0.5));
        products.add(new Product("Конфеты", 650.50, 0.7));
        products.add(new Product("Помидоры", 150, 0.9));
        products.add(new Product("Бананы", 150, 1.5));

        ProductList productList = new ProductList(products);
        System.out.println(productList);

//        productList.add(new Product("Бананы", 150, 1.5));
//        System.out.println(productList);

//        productList.remove(new Product("Соль", 60, 0.2));
//        System.out.println(productList);
        productList.add(new Product("Соль", 60, 0.2));
        System.out.println(productList);
        productList.remove(new Product("Конфеты", 650.50, 0.7));
        System.out.println(productList);

    }

    public static void doTask2_1() {
        System.out.println("ДЗ 2 задание 1");
        Set<Recipe> recipes = new HashSet<>();
        Product mango = new Product("Манго", 150.50, 0.200);
        Product shugar = new Product("Сахар", 65, 0.1);
        Product banana = new Product("Бананы", 100.50, 0.250);
        Product meat = new Product("Мясо", 485.00, 0.300);
        Product salt = new Product("Соль", 60, 0.005);
        ProductList productList1 = new ProductList(Set.of(mango, shugar));
        ProductList productList2 = new ProductList(Set.of(shugar, banana));
        ProductList productList3 = new ProductList(Set.of(salt, meat));

        Recipe desertMango = new Recipe("Десерт из манго", 290.50, productList1);
        Recipe desertBanana = new Recipe("Десерт из банана", 150.90, productList2);
        Recipe steak = new Recipe("Стейк", 450.20, productList3);
        recipes.add(desertBanana);
        recipes.add(desertMango);
        recipes.add(steak);
        RecipeList recipeList = new RecipeList(recipes);
        System.out.println(recipeList);

        Recipe rulet = new Recipe("Рулет", 450.20, productList3);
        recipeList.add(rulet);
        System.out.println(recipes);
        recipeList.remove(desertMango);
        System.out.println(recipes);

        Recipe carbonad = new Recipe("Стейк", 450.20, productList3);
//        recipeList.add(carbonad);
//        System.out.println(recipes);

        recipeList.remove(desertMango);
        System.out.println(recipes);


    }


    public static void doTask2_2() {
        System.out.println("ДЗ 2 задание 2");
        Random random = new Random();
        Set<Integer> nums = new HashSet<>();
        while (nums.size() < 20) {

            nums.add(random.nextInt(0, 1000));
        }
        System.out.println(nums);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(nums);
    }
}