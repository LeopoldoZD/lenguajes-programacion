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
public class Cliente {
    private String email;
    private int edad;
    
/**
 * 
 * 
     * @param email
     * @param edad
 */
    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

    /**
     * Este metod nos regresa el email que ya previamente
     * se debio haber proporcionado por le metodo ser correspondiente
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Este metodo necesita que proporciones un string
     * que va a ser el email que le va a asignar al cliente
     * @param email aqui debes de poner el string correspondiente al email
     * @throws Capitulo5Excepciones.ValidarEmail
   
     
     */
    public void setEmail(String email) throws ValidarEmail{
        ValidarEmail.checarValidarEmail(email);
      
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     * @throws Capitulo5Excepciones.ValorNoNegativoException
     * @throws Capitulo5Excepciones.MenorDeEdadException
     * 
     */
    public void setEdad(int edad) throws ValorNoNegativoException, 
            MenorDeEdadException{
        
      
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad(edad);
        
        this.edad = edad;
    }

    
    
}


