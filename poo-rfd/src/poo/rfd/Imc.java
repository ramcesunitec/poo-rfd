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
public class Imc {
    Usuario u; // El atributo es de tipo composicion-agregacion porque Usuario es una clase
    
    public String calcular(){
        
        float imc=u.peso/(u.altura*u.altura);
        
        return "Aqui aparecera tu resultado "+imc;
    }
    
}
