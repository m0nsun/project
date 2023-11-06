import generator.IntGenerator;
import generator.RandomIntGenerator;
import generator.TimeDependentIntGenerator;
import generator.SerialIntGenerator;

public class App {
    public static void main(String[] args) {
        demoIntGenerator();
    }

    public static void demoIntGenerator() {
        IntGenerator[] generators = {
            new RandomIntGenerator("Random Generator"),
            new TimeDependentIntGenerator("Time-Dependent Generator"),
            new SerialIntGenerator("Serial Generator")
        };

        for (IntGenerator generator : generators) {
            System.out.println("Generator Name: " + generator.getName());
            for (int i = 0; i < 15; i++) {
                System.out.println("Positive: " + generator.nextPositive());
                System.out.println("Negative: " + generator.nextNegative());
            }
            System.out.println();
        }
    }
}
