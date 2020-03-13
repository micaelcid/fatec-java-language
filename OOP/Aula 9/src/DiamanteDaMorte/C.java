package DiamanteDaMorte;

public interface C extends A {
    default void metodo() {
        System.out.println("Metodo de C");
    }
}
