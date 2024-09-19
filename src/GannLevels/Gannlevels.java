package GannLevels;

public class Gannlevels {


    private static double[] calculateGannLevels(double high, double low) {
        double range = high - low;
        return new double[]{
//                high,
                Math.round(low + range * 0.875),
                Math.round(low + range * 0.75),
                Math.round(low + range * 0.625),
                Math.round(low + range * 0.50),  // Midpoint
                Math.round(low + range * 0.375),
                Math.round(low + range * 0.25),
                Math.round(low + range * 0.125),
//                low
        };
    }
    private static boolean printGannLevels(double[] gannLevels) {
        System.out.println("Gann levels:");
        for (double level : gannLevels) {
            System.out.println("level is " + "   " +  level);
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(printGannLevels(calculateGannLevels(5533,5616)));

    }
}
