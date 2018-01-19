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
public class PooRfd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO");
        
        //Hay que generar los objetos de las clases anteriores
        Usuario x=new Usuario();
        x.altura=1.65f;
        x.peso=56;
        Imc algo=new Imc();
        algo.u=x;
        //Se calcula el IMC a traves de su objeto
        System.out.println(algo.calcular());
        
                
        
    }
    
}
