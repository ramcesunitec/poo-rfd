
package ete;

import java.io.Serializable;

public class Examen implements Serializable {

private String nombre;
private float calificacion;

    public Examen(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }



    
}
