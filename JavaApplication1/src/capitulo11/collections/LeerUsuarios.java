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
public class LeerUsuarios {
    public static void main(String[] args)throws Exception{
       //Creamos un objeto de lca clase PersistenciaUsuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        //invocamos el metodo buscar todos
        System.out.println( p.buscarTodos().size());
        for(Usuario u:p.buscarTodos()){
         System.out.println("Login:"+u.getLogin()+"password: "+u.getPassword());   
         
        }
    }
}
