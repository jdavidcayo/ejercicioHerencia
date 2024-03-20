class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String genero, String color) {
        super(nombre, edad, genero);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }

    @Override
    public void informacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Género: " + this.getGenero());
        System.out.println("Color: " + this.getColor());
    }
}

