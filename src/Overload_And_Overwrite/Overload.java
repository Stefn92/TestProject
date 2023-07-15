package Overload_And_Overwrite;

public class Overload {

    static int a;
    static int b;
    static int c;
    static String d;

    // Überladen von Methoden und Konstruktoren

    public static void main(String[] args) {
        Overload overload1 = new Overload(5, 2, "Name");
        Overload overload2 = new Overload(5, 2, 8);
        Overload overload3 = new Overload("Name");
        System.out.println(overload2.doSomething(a, b));
        System.out.println(overload3.doSomething(a, b, c));
    }

    public Overload(int a, int b, String d) {
        this.a = a;
        this.b = b;
        this.c = 10;
        this.d = d;
    }

    public Overload(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = "Name";
    }

    public Overload(String d) {
        this.a = 5;
        this.b = 20;
        this.c = 50;
        this.d = d;
    }

    public int doSomething(int a, int b) {
        return a + b;
    }

    public int doSomething(int a,int b, int c) {
        return a + b + c;
    }
}
