
package examen;
import java.util.*;

public class Pago {
    
    ArrayList<Horas>hora;
    
    
    public Pago(){
    
        hora=new ArrayList<>();
    }
    
    public void agregarPago(Horas h){
        hora.add(h);
    }
    
    public ArrayList<Horas> obtenerPago(){
        return hora;
    }
    

    
    
  
   

    
    
    
}
