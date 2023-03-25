
package examenii_p2_diegoandino;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable{
    private String nombre;
    private ArrayList<Torneo> torneos = new ArrayList();
    public final int SerialVersionUID = 2163;
    

   

    public Deporte(String nombre) {
      
        this.nombre = nombre;
    }

    
    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Deporte{" + "torneos=" + torneos + ", SerialVersionUID=" + SerialVersionUID + ", nombre=" + nombre + '}';
    }

  
    
    
    
}
