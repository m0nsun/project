package generator;

import java.util.Random;

public class RandomIntGenerator implements IntGenerator {
    private String name;

    public RandomIntGenerator(String name) {
        this.name = name;
    }

    @Override
    public int nextPositive() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }

    @Override
    public int nextNegative() {
        Random random = new Random();
        return -random.nextInt(Integer.MAX_VALUE);
    }

    @Override
    public String getName() {
        return name;
    }
}
