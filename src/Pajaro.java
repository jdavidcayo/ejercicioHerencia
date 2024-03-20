class Pajaro extends Animal {
    private String especie;
    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta.");
    }

    @Override
    public void informacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Género: " + this.getGenero());
        System.out.println("Especie: " + this.getEspecie());
    }
}
