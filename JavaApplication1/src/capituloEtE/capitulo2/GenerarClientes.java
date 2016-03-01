/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capituloEtE.capitulo2;

/**
 *
 * @author Orange75
 */
public class GenerarClientes {
    public static Cliente[] obtenerClientes(){
        Cliente clientes[]=new Cliente[3];
        clientes[0]=new Cliente("Ana","lopez", 20, 20000,new Direccion("sur 11",20,"ecatepunk") );
        clientes[1]=new Cliente("Pedro","martinez",45,14000, new Direccion("mexico",122,"nezayork"));
        clientes[2]=new Cliente("Laura","gomez",30,70000,new Direccion("r-1",43,"cloacalco"));
        
        
        
        
        
        return clientes;
        
    }
    
}
