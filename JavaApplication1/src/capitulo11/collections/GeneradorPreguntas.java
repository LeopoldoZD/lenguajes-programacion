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
        Opcion p4=new Opcion("londres", false);
        Opcion q1=new Opcion ("Tokio",false);
        Opcion q2=new Opcion ("Beijing",true);
        Opcion q3=new Opcion ("Seul",false);
        Opcion q4=new Opcion ("Pyojang",false);
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        opciones.add(p1);
        opciones.add(p2);
        opciones.add(p3);
        opciones.add(p4);
        ArrayList<Opcion> opcionesq=new ArrayList<Opcion>();
        opcionesq.add(q1);
        opcionesq.add(q2);
        opcionesq.add(q3);
        opcionesq.add(q4);
        
        // relacion moderada de objetos
        Pregunta P1=new Pregunta("1.- Capital de rusia", opciones);
        Pregunta P2=new Pregunta("2.- Capital de China", opcionesq);
        
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(P1);
        preguntas.add(P2);
        return preguntas;
        
    }
}