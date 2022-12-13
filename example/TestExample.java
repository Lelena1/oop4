package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestExample {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Example> examples = new HashSet<>();
        while (examples.size() < 15) {
            Example example = new Example(random.nextInt(2, 10),
                    random.nextInt(2, 10));
            examples.add(example);
        }
        for (Example example : examples) {
            System.out.println(example);
        }
    }
}
