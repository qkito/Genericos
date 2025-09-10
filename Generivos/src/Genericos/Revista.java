
package Genericos;

public class Revista extends MaterialDigital {
    public String fotografo;

    public Revista(String titulo, String autor, int añoPublicacion, String fotografo) {
        super(titulo, autor, añoPublicacion);
        this.fotografo = fotografo;
    }
    
    @Override
    public void ShowInfo() {
        System.out.println("Titulo: " + this.titulo + "autor: " + this.autor + "Año: " + this.añoPublicacion + "Fotografo: " + this.fotografo);
    }
}
