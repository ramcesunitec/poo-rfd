
package examen;


public class Trabajador {
    private String trabajadores;
    private String tipo;
    
    public Trabajador(String trabajadores, String tipo){
        this.trabajadores=trabajadores;
        this.tipo=tipo;
    }

    /**
     * @return the trabajadores
     */
    public String getTrabajadores() {
        return trabajadores;
    }

    /**
     * @param trabajadores the trabajadores to set
     */
    public void setTrabajadores(String trabajadores) {
        this.trabajadores = trabajadores;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
