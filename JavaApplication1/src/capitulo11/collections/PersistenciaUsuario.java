/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;
import java.io.BufferedInputStream.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-101
 guardar en base de datos es persistencia*/
public class PersistenciaUsuario {
     ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
       usuarios=new ArrayList<>();
    }

    
    //primero colocamos el metodo de buscar todos
   ArrayList<Usuario> buscarTodos()throws Exception{
        //paso 1. leemos el ARCHIVO donde esta guardado el arraylist
       File f=new File("archivaldo.raton");
       //2. leemos el contenido
       FileInputStream fis=new FileInputStream(f);
       //3. Descomprimir el contenido
       ObjectInputStream ois=new ObjectInputStream(fis);
      usuarios=(ArrayList<Usuario>) ois.readObject();
       return usuarios;
    }
   public void guardar(Usuario u)throws Exception{
       File f=new File("archivaldo.raton");
       if(f.exists())usuarios=buscarTodos();//si no se coloca esta linea, el arreglo se borra automaticamente
       FileOutputStream fos=new FileOutputStream(f);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       usuarios.add(u);
       oos.writeObject(usuarios);
   }
}
