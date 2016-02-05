/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //declaramos un arreglo de enteros y los inicializamos
       //explicita y sabes el valor de los arreglo
        int x[]={1,34,16,8};
        //implicita y no sabes los valores del arreglo
        float[]y=new float[4];
        float z;
        
        //todos los arreglos son tratados por el compilador como objetos
        //System.out.println(x[4]);
        
     A objeto=new A();
        System.out.println(objeto.m);
        System.out.println(y[2]);//es tratado como objeto en el arreglo
        //System.out.println(z);
      // vamos a iterar(ciclar) el arreglo x
       for (int i=0;i<x.length;i++) {
           System.out.println(x[i]);
        }
      //el ciclo for para x mejorado
        for(int w:x){
           
                    
            System.out.println(w);
            
        }
    }
    
}
class A{
    float m;
    
    
}