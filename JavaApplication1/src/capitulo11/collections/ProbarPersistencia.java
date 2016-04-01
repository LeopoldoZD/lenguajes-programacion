/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

/**
 *
 * @author T-101
 */
public class ProbarPersistencia {
    public static void main(String[] args)throws  Exception{
        //primero creamos un usuario con su login y password
        Usuario u1=new Usuario();
        u1.setLogin("tu");
        u1.setPassword("56789");
        //ahora usaremos la clase persitencia usuario para persistir(guardar)
        //a este usuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        p.guardar(u1);
         System.out.println("usuario guardado con exito");  
         
    }
    
}
