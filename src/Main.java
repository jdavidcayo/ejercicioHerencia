public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Fido", 3, "Macho", "Labrador");
        Gato gato = new Gato("Garfield", 5, "Macho", "Naranja");
        Pajaro pajaro = new Pajaro("Tweety", 1, "Hembra", "Canario");

        perro.hacerSonido();
        perro.informacion();
        System.out.println();

        gato.hacerSonido();
        gato.informacion();
        System.out.println();

        pajaro.hacerSonido();
        pajaro.informacion();

    }
}
