public class dz9 {
    public static void main(String args[]){
        int weight;
        double k_moon = 0.17;
        try {
            weight = Integer.parseInt(args[0]);
            System.out.println("Your weight on the moon will be " + k_moon*weight);
        }
        catch(Exception e) {
            System.out.println("Invalid data");
        }        
    }
}
