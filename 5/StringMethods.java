public class StringMethods {
    public static void main(String args[]) {
        String str1 = "still learning ...";
        String str2 = new String(str1);
        String str3 = "It will never end";

        int res, idx;
        System.out.println("Displaying each character of a string");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        System.out.println();

        // Comparing strings with .equals()
        if (str1.equals(str2)) {
            System.out.println("Str1 = str2");
        } else {
            System.out.println("Str1 != str2");
        }
        if (str1.equals(str3)) {
            System.out.println("Str1 = str3");
        } else {
            System.out.println("Str1 != str3");
        }

        res = str1.compareTo(str3);
        if (res == 0) {
            System.out.println("Str1 equals str3");
        } else if (res < 0) {
            System.out.println("Str1 < str3");
        } else {
            System.out.println("str1 > str3");
        }
        str2 = "zxc? One Two Three zxc?";
        idx = str2.indexOf("zxc?");
        System.out.println("\"zxc\"  idx1: " + idx);
        idx = str2.lastIndexOf("zxc?");
        System.out.println("\"zxc?\" idx2: " + idx);
    }
}