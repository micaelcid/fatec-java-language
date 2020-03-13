package DiamanteDaMorte;

public interface B extends A {
    default void metodo() {
        System.out.println("Metodo de B");
    }
}
