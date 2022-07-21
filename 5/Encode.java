public class Encode {
    public static void main(String args[]) {
        String msg = "Heelo it es testo de presto@@AS";
        String encmsg = "";
        String decmsg = "";
        int key = 3;

        System.out.println("Init message: " + msg);
        // Ecnode message
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("Encoded message:\t" + encmsg);
        // Decode message
        for (int i = 0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("Decoded message:\t" + decmsg);
    }
}
