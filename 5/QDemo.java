public class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        double ch;
        int i;
        System.out.println("nums in bQ");
        for (i = 0; i < 26; i++) {
            bigQ.put((double) (i + 0.1));
        }
        System.out.println("bigQ contents");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != 0)
                System.out.print(ch + "; ");
        }

        System.out.println("\n");
        System.out.println("Errors in sQ");
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((double) (i + 0.3));
            // System.out.println();
        }

        System.out.println("smallQ contents");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != 0)
                System.out.print(ch + "; ");
        }
        System.out.println("Addition info: " + smallQ.getloc + " <> " + smallQ.putloc);
    }
}

class Queue {
    double q[]; // массив для хранения очереди
    int putloc, getloc; // индексы вставки и извлечения элементов

    Queue(int size) {
        q = new double[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    void put(double ch) {
        if (putloc == q.length) {
            System.out.println("Error:\tОчередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    double get() {
        if (getloc == putloc) {
            System.out.println("Error:\tОчередь пуста");
            return 0;
        }

        return q[getloc++];
    }
}
