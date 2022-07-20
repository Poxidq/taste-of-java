class ParamConst {
    public static void main(String args[]) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(120);
        System.out.println("t1:\t" + t1.x + "\nt2:\t" + t2.x);
    }
}

class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
}