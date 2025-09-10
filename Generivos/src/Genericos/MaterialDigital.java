package Genericos;

public abstract class MaterialDigital {
    
    public String titulo;
    public String autor;
    public int añoPublicacion;

    public MaterialDigital(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    public abstract void ShowInfo();
    
}
