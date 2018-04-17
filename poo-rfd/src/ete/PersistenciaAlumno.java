/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class PersistenciaAlumno {
    
    ArrayList<Alumno> alumnos;
   public PersistenciaAlumno(){
       alumnos=new ArrayList<>();
        } 
    
   public ArrayList<Alumno> leerTodos(){
       File file=new File("alumnos");
       try{
           FileInputStream fis=new FileInputStream(file);
           ObjectInputStream ois=new ObjectInputStream(fis);
           
           alumnos =(ArrayList<Alumno>)ois. readObject();
       }catch(Exception e){
           System.out.println("Esto ocurrio al leer "+ e.getMessage());
       }
              return alumnos;
   }
   
   //Guardar
   public void guardar(Alumno alumno){
       try{
          File file=new File("alumnos");
          if(file.exists())alumnos=leerTodos();
           FileOutputStream fos=new FileOutputStream(file);
           ObjectOutputStream oos=new ObjectOutputStream(fos);
           
           //primero agrafamos al array list
           alumnos.add(alumno);
           //Ahora si volvemos a guardar todo el arrayList al seriazado
           oos.writeObject(alumnos);
       }catch(Exception e){
           System.out.println("Esto ocurrio con el guardado "+e.getMessage());
       }
   }
}
