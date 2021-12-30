package annotations;

public class Parent {
    @SuppressWarnings("unused")
    public void someMethod() {
    }

    @Deprecated
    public void otherMethod() {
        System.out.println("Doing old stuff...");
    }
}
