public class Help2 {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        String[] helpInfo = { "help", "if", "nani?", "switch" };
        for (int i = 0; i < helpInfo.length; i++) {
            System.out.println(i + 1 + ") " + helpInfo[i]);
        }
        System.out.println("Напишите '0', чтобы выйти");
        do {
            choice = (char) System.in.read();

            // clear the buff
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            switch (choice) {
                case '1':
                    for (int i = 0; i < helpInfo.length; i++) {
                        System.out.println(i + 1 + ") " + helpInfo[i]);
                    }
                    break;
                case '2':
                    System.out.print("Инструкция if:\n");
                    System.out.print("if (условие) {\n");
                    System.out.print("\tинструкция;\n");
                    System.out.print("}\n");
                    System.out.print("else if (условие) {\n");
                    System.out.print("\tинструкция;\n");
                    System.out.print("}\n");
                    System.out.print("else {\n");
                    System.out.print("\tинструкция;\n");
                    System.out.print("}\n");
                    break;
                case '3':
                    System.out.print("^-^ nya!\n");
                    break;
                case '4':
                    System.out.print("Инструкция Switch:\n");
                    System.out.print("switch (выражение) {\n");
                    System.out.print("\tcase константа:\n");
                    System.out.print("\t\tпоследовательность инструкций;\n");
                    System.out.print("\t\tbreak;\n");
                    System.out.print("\t\t// ...\n");
                    System.out.print("}\n");
                    break;
            }
        } while (choice != '0');
    }
}
