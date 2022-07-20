public class CalcFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int dist = 289;

        // minivan
        minivan.passengers = 8;
        minivan.mpg = 16;
        minivan.fuelcap = 21;

        // sportcar
        sportcar.passengers = 2;
        sportcar.mpg = 12;
        sportcar.fuelcap = 14;

        System.out.println("Для преодоления " + dist + " миль мини-фургону потребуется " + minivan.fuelneeded(dist)
                + " галлонов топлива");
        System.out.println("Для преодоления " + dist + " миль спорткару потребуется " + sportcar.fuelneeded(dist)
                + " галлонов топлива");
    }
}

class Vehicle {
    int passengers;
    int mpg;
    int fuelcap;

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
