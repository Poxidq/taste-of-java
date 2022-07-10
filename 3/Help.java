public class Help {
    public static void main(String args[]) throws java.io.IOException {
        System.out.println("Выберите пункт, информацию о котором хотите узнать");
        String[] helpInfo = { "switch", "if", "nani?" };
        for (int i = 0; i < helpInfo.length; i++) {
            System.out.println(i + 1 + ") " + helpInfo[i]);
        }
        char choice = (char) System.in.read();
        switch (choice) {
            case '1':
                System.out.print("Инструкция Switch:\n");
                System.out.print("switch (выражение) {\n");
                System.out.print("\tcase константа:\n");
                System.out.print("\t\tпоследовательность инструкций;\n");
                System.out.print("\t\tbreak;\n");
                System.out.print("\t\t// ...\n");
                System.out.print("}\n");
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
                System.out.print("^-^ nya!");
                break;
        }
    }
}
