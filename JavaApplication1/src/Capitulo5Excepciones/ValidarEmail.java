/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5Excepciones;

/**
 *
 * @author Orange75
 */
class ValidarEmail extends Exception{
public ValidarEmail(){
    
}
    static void checarValidarEmail(String email) {
         String hola;
    hola = "holamundo@hotmail.xom";
        if(hola.contains("@")){
            
            System.out.println("Si contiene un arroba");
        }else{
            System.out.println("no contiene un arroba");
        }
    }

}


    

