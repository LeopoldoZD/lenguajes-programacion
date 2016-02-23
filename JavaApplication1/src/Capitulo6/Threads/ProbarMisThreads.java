/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.Threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar pausa
        //1 Creado
        MiPrimerThread t1=new MiPrimerThread();
       //opcionalmente le ponemos nombre
        t1.setName("chana");
         // 2. Inicializado
       t1.start();
        
        //3. En ejecucion (cuando corras este programa) y se active
        //su metodo run
        
        
        //5. Muerte: cuando complete la tarea el codigo del metodo run
        
        
    }
    
}
