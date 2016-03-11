/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.util.*;

/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
   
    public  static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //vamos a crear una pregunta con tres opciones
        Opcion p1=new Opcion("Moscu",true);
        Opcion p2=new Opcion("florencia", false);
        Opcion p3=new Opcion("Paris", false);
        ArrayList<Opcion>opciones=new ArrayList<Opcion>();
        opciones.add(p1);
        opciones.add(p2);
        opciones.add(p3);
        
        // relacion moderada de objetos
        Pregunta P1=new Pregunta("Capital de rusia", opciones);
        
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(P1);
        return preguntas;
        
    }
}