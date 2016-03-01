/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capituloEtE.capitulo2;

import capituloEtE.Modelo;

/**
 *arreglos con los datos de la clase modelo
 * @author T-101
 */
public class GenerarClientes  {
 
       
       public static Modelo[]obtenerClientes() {
         
           Modelo Modelos[]=new Modelo[3];
           Modelos[0]=new Modelo("Ana","Lopez",20,20000,new Direccion("sur 11",20,"ecatepunk"));
          Modelos[1]=new Modelo("pedro","martinez",45,14000,new Direccion("mexico",122,"nezayork"));
          Modelos[2]=new Modelo("laura","gomez",30,70000,new Direccion("R - 1",43,"cloacalco"));
         
       
                   
           
           return Modelos;
            
        }

   
        
        
    

    
}
