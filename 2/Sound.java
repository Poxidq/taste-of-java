class Sound {
    public static void main(String args[]) {
        int speed = 330; // in meter/sec
        double distance, time;
        try {
            time = Double.parseDouble(args[0]);
            distance = time * speed;
            System.out.println("Distance is " + distance);
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }
}
