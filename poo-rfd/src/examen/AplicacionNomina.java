/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.*;
public class AplicacionNomina {
    
    public static void main(String[] args) {
        Trabajador tr1=new Trabajador("Juan","Honorarios");
        Trabajador tr2=new Trabajador("Pedro","Planta");
        Trabajador tr3=new Trabajador("Ana","Proyecto");
        
        ArrayList<Trabajador>trabajadores= new ArrayList<>();
        trabajadores.add(tr1);
        trabajadores.add(tr2);
        trabajadores.add(tr3);
        
        Horas h1=new Horas(40, trabajadores);
       
    }

    
    
}
