package Animal;

public interface Animal {
    void emitirSom();

    default void dormir() {
        System.out.println("ZzZzZz");
    }
}
