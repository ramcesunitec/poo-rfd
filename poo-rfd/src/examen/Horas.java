
package examen;
import java.util.*;
public class Horas {
  private float horas;
   private ArrayList<Trabajador>trabajadores;
   
   public Horas(float horas,ArrayList<Trabajador>trabajadores){
   this.horas=horas;
   this.trabajadores=trabajadores;
   }
   
   public Horas(){
       
   }

    /**
     * @return the horas
     */
    public float getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(float horas) {
        this.horas = horas;
    }

    /**
     * @return the trabajadores
     */
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    /**
     * @param trabajadores the trabajadores to set
     */
    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
      
}
