public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 1;
        for (gallons = 1; gallons <= 100; gallons += 1) {
            liters = gallons * 3.7854;
            System.out.println(counter + ") " + gallons + " галлонам соответствует \t" +
                    liters + " литра.");
            if (counter % 10 == 0) {
                System.out.println();
            }
            counter++;
        }
    }
}
