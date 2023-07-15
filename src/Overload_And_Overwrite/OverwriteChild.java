package Overload_And_Overwrite;

public class OverwriteChild extends OverwriteParent {

    // Unterklasse überschreibt die "doSomething" Methode

    public static void main(String[] args) {
        OverwriteChild overwriteChild = new OverwriteChild();
        overwriteChild.doSomething();
    }

    public void doSomething() {
        super.doSomething();
        System.out.println("I'm doing something else!");
    }
}
