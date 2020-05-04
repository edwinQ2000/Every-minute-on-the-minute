/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmer;

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
        
        
       Scanner sc=new Scanner(System.in);
       int total=sc.nextInt();
       int activo=sc.nextInt();
       control cont=new control(total,activo);
       cont.correr();
       
    }
    
}
