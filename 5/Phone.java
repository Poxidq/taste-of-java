class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                { "Tom", "8989898" },
                { "Jerax", "8989898" },
                { "matu", "8989898" },
                { "epil", "8989898" },
        };
        String name;
        int i;

        if (args.length != 1) {
            System.out.println("Usage: java Phone.java <name>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                name = args[0].toLowerCase();
                if (numbers[i][0].toLowerCase().equals(name)) {
                    System.out.println(numbers[i][0] + " : " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Number is not found");
            }
        }

    }
}