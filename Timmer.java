/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmer;

import java.awt.EventQueue;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Timmer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraVentana ventanaUno = new PrimeraVentana();
					ventanaUno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
    
    	});
      
    }
        
    
}

    		
   
   
  
    

