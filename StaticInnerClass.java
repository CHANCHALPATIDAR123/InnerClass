class Outer1 {
    static int a = 20;
    int b = 30;

    public static void display() {
        System.out.println("display value a:" + a);
    }

    static class Inner1 {
        static int b = 10;

        Inner1() {
            // int b=a;
            System.out.println("i am inner class");
        }
    }
}

class StaticInner {
    public static void main(String[] args) {
        Outer1.Inner1 ob = new Outer1.Inner1();
        Outer1 p = new Outer1();
        new Outer1.Inner1();
        System.out.println();
        System.out.println(Outer1.a);
        System.out.println(p.b);

    }
}
