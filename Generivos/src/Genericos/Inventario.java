
package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends MaterialDigital> {
    public List<T> materiales = new ArrayList<>();
    
    public void Agregar(T material) {
        materiales.add(material);
}
    
    public void mostrarInventario(){
        for(T m:materiales) {
            m.ShowInfo();   
        }
    }
    
}
