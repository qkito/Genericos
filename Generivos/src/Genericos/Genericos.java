package Genericos;

public class Genericos {

    public static void main(String[] args) {
        
        System.out.println("Hello world");
        
        Inventario<MaterialDigital> inventario = new Inventario<>();
        
        Revista rev = new Revista("News2025", "jose torre", 2019, "Jose Juan");
        Libro lib = new Libro("El principito", "Luis osuna", 2001);
        
        inventario.Agregar(rev);
        inventario.Agregar(lib);
        
        
        
    }
    
}
