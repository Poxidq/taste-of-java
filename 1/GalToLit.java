/*
    Перевод галлонов в литры 
    1 галлон = 3,7854 литра
 */
public class GalToLit {
    public static void main(String args[]) {
        double gall, liters;

        gall = 10;
        liters = gall * 3.7854;
        System.out.println(gall + "\tin liters\t=\t" + liters);
    }
}
