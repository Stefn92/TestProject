package Abstract;

public class ChildClass extends AbstractClass {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.berechne();
    }

    @Override
    public int berechne() {
        return 0;
    }
}
