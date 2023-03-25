
package examenii_p2_diegoandino;

import java.io.Serializable;

public class Partido implements Serializable  {
    private String[] equipos = new String[2];
    private int puntos1;
    private int puntos2;
    public final int SerialVersionUID = 11345;
    public Partido() {
    }

    
    public Partido(int puntos1, int puntos2) {
        this.puntos1 = puntos1;
        this.puntos2 = puntos2;
    }

    public String[] getEquipos() {
        return equipos;
    }

    public void setEquipos(String[] equipos) {
        this.equipos = equipos;
    }

    public int getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(int puntaje1) {
        this.puntos1 = puntos1;
    }

    public int getPuntose2() {
        return puntos2;
    }

    public void setPuntos2(int puntaje2) {
        this.puntos2 = puntos2;
    }

    @Override
    public String toString() {
        return "Partido{" + "equipos=" + equipos + ", puntaje1=" + puntos1 + ", puntaje2=" + puntos2 + ", SerialVersionUID=" + SerialVersionUID + '}';
    }

    

}
