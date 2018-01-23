/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.rfd;

/**
 *
 * @author T-102
 */
public class Usuario {
    //Regla 1 del encapsulamiento
    private float peso;
    private float altura;

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso este es el valor del peso que debes pasar al metodo
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura este es el valor de la altura que debes pasar al metodo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
