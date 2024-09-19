package GannLevels;

public class Gannlevels {


    private static double[] calculateGannLevels(double high, double low) {
        double range = high - low;
        return new double[]{
                high,
                low + range * 0.875,
                low + range * 0.75,
                low + range * 0.625,
                low + range * 0.50,  // Midpoint
                low + range * 0.375,
                low + range * 0.25,
                low + range * 0.125,
                low
        };
    }
    private static boolean printGannLevels(double[] gannLevels) {
        System.out.println("Gann levels:");
        for (double level : gannLevels) {
            System.out.println(level);
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(printGannLevels(calculateGannLevels(5533,5616)));

    }
}
