/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;


import java.io.Serializable;
 
public class Alumno implements Serializable{
    private Long cuenta;
    private String nombre;
    private String apateno;
    private String amaterno;
    private Examen examen;

    public Alumno(Long cuenta, String nombre, String apateno, String amaterno, Examen examen) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apateno = apateno;
        this.amaterno = amaterno;
        this.examen = examen;
    }

    public Long getCuenta() {
        return cuenta;
    }

    public void setCuenta(Long cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApateno() {
        return apateno;
    }

    public void setApateno(String apateno) {
        this.apateno = apateno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    
            
    
    
}
