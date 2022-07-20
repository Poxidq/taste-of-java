public class WithMethod {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        // minivan
        minivan.passengers = 8;
        minivan.mpg = 16;
        minivan.fuelcap = 21;

        // sportcar
        sportcar.passengers = 8;
        sportcar.mpg = 16;
        sportcar.fuelcap = 21;

        System.out.print("Minivan:\t");
        minivan.info();
        System.out.print("Sportcar:\t");
        sportcar.info();
    }
}

class Vehicle {
    int passengers;
    int mpg;
    int fuelcap;

    void info() {
        System.out.println(
                "Транспорт может перевезти " + passengers + " человек на расстояние " + fuelcap * mpg + " миль");
    }
}
