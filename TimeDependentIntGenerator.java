package generator;

public class TimeDependentIntGenerator implements IntGenerator {
    private String name;

    public TimeDependentIntGenerator(String name) {
        this.name = name;
    }

    @Override
    public int nextPositive() {
        long currentTime = System.currentTimeMillis();
        return (int) (currentTime % Integer.MAX_VALUE);
    }

    @Override
    public int nextNegative() {
        long currentTime = System.currentTimeMillis();
        return (int) (-currentTime % Integer.MAX_VALUE);
    }

    @Override
    public String getName() {
        return name;
    }
}