public class HelpClassDemo {
    public static void main(String args[]) throws java.io.IOException {
        char choice, ignore;
        Help helpMenu = new Help();

        for (;;) {
            do {
                helpMenu.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpMenu.isvalid(choice));

            if (choice == 'q')
                break;
            System.out.println("٩( ᐛ )و".repeat(10));
            helpMenu.helpon(choice);
        }
    }
}

class Help {
    void helpon(char choice) {
        switch (choice) {
            case '1':
                String[] helpInfo = { "help", "if", "nani?", "switch" };
                for (int i = 0; i < helpInfo.length; i++) {
                    System.out.println(i + 1 + ") " + helpInfo[i]);
                }
                break;
            case '2':
                System.out.print("\nИнструкция if:\n");
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
                System.out.print("\n^-^ nya!\n");
                break;
            case '4':
                System.out.print("\nИнструкция Switch:\n");
                System.out.print("switch (выражение) {\n");
                System.out.print("\tcase константа:\n");
                System.out.print("\t\tпоследовательность инструкций;\n");
                System.out.print("\t\tbreak;\n");
                System.out.print("\t\t// ...\n");
                System.out.print("}\n");
                break;
        }
    }

    void showmenu() {
        String[] helpInfo = { "help", "if", "nani?", "switch" };
        System.out.println("Введите 'q', чтобы закрыть меню");
        for (int i = 0; i < helpInfo.length; i++) {
            System.out.println(i + 1 + ") " + helpInfo[i]);
        }
    }

    boolean isvalid(char ch) {
        if (ch < '1' | ch > '4' & ch != 'q')
            return false;
        else
            return true;
    }
}