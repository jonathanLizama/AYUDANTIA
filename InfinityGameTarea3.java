/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication211;

import static java.lang.System.in;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class InfinityGameTarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    }
    public static int EntradaNumero() {
    	try {
        	Scanner leer = new Scanner(in);
        	int numero = leer.nextInt();
        	
        	if(numero>=20){
            
        	}
     	return numero;
    	} catch (InputMismatchException e) {
          
            System.out.println("se ha generado un error");
            return 0;
            }
      
	}
    
    
    
    
    
    
    
    


    
}
