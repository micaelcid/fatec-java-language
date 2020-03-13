public class App {
    public static void main(String[] args) {


        Animal cachorro = new Cachorro("Rex");
        cachorro.emitirSom();
        cachorro.comer();
        cachorro.emitirSom();
        cachorro.dormir();

        Animal gato = new Gato("Felix");

        Zoo zoo = new Zoo();
        zoo.verificarAnimal(cachorro);
        zoo.verificarAnimal(gato);
    }
}
