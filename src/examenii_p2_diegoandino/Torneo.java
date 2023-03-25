package examenii_p2_diegoandino;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Torneo implements Serializable {

    private String nombre;
    private String periodo;
    private ArrayList<Equipos> equipos = new ArrayList();
    private ArrayList<Partido> partidos = new ArrayList();
    public final int SerialVersionUID = 7463;

    public Torneo() {
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void sortTeams() {
        for (int i = 0; i < equipos.size(); i++) {

            for (int j = i; j < equipos.size(); j++) {
                if (equipos.get(i).getPuntos() < equipos.get(j).getPuntos()) {

                    Collections.swap(equipos, i, j);
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", periodo=" + periodo + ", equipos=" + equipos + ", partidos=" + partidos + ", SerialVersionUID=" + SerialVersionUID + '}';
    }

}
