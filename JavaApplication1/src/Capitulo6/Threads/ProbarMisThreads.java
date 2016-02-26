/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *los constructores no pueden crear clases
 * @author T-101
 */
public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar pausa
        //1 Creado
        MiPrimerThread t1=new MiPrimerThread();
        //otro thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r); //es mas versatil que la primera
        Thread t3=new Thread(r);
        
        //el thread t2 tiene que hacer que se impriman del 1 al 10
        //con intervalos de 5 segundos entre impresion
        
        //El thread t3 tiene que hacer que se imprima la frase
        //"todos vamos a morir" hasta el final de los tiempos
        //cada segundo
       //opcionalmente le ponemos nombre
        t1.setName("chana");
        t2.setName("juana");
        t3.setName("pedro");
        
         // 2. Inicializado
       t1.start();
       t2.start();
       t3.start();
        
        //3. En ejecucion (cuando corras este programa) y se active
        //su metodo run
        
        
        //5. Muerte: cuando complete la tarea el codigo del metodo run
        
        
    }

    @Override
    public void run() {
        //primero preguntamos si es el thread t2 y si es que imprima del 1 al 10
        if(Thread.currentThread().getName().equals("juana")){
            int x=1;
            for (int i=0; i<=30;i++){
            System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        }if(Thread.currentThread().getName().equals("pedro")){
            while(true){
                System.out.println("Todos vamos a morir");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
        }
    }

    
}
