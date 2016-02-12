/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5Excepciones;

/**
 *
 * @author T-101
 */
public class ClaseMuyUtil {
    
    public static void main(String[] args) {
        String hola="hola mundo@hotmail.xom";
        if(hola.contains("@")){
            System.out.println("Si contiene un arroba");
        }else{
            System.out.println("no contiene un arroba");
        }
    }
}
