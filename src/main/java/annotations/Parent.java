package annotations;

@SuppressWarnings("unused")
public class Parent {
    public void someMethod() {
    }

    @Deprecated
    public void otherMethod() {
        System.out.println("Doing old stuff...");
    }
}
