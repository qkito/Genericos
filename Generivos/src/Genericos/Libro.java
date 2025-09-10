package Genericos;

public class Libro extends MaterialDigital {

    public Libro(String titulo, String autor, int añoPublicacion) {
        super(titulo, autor, añoPublicacion);
    }

    @Override
    public void ShowInfo() {
        System.out.println("Titulo: " + this.titulo + "autor: " + this.autor + "Año: " + this.añoPublicacion);
    }
}
