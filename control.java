/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmer;

import javax.swing.JOptionPane;

/**
 *
 * @author Edwin
 */
public class control {
    public int total,activo;
    public boolean cronometroA;
  
    public control(int total,int activo){
        this.total=total;
        this.activo=activo;
        
       
    }
    
    public void alarma(String msm){
        System.out.println(msm);
    }
    
    public void correr() {
        int minutos=total,segundos=60,milesimas=0;
        
           try{
               cronometroA=true;
                while (cronometroA){
                    Thread.sleep(4);
                    //Incrementamos 4 milesimas de segundo
                    milesimas += 4;

                    //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
                    //y las milesimas de segundo de nuevo a 0
                    if( milesimas == 1000 ){
                        milesimas = 0;
                        segundos -= 1;
                        //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                        //y los segundos vuelven a 0
                        if( segundos == (60- activo)){
                           alarma("Descansar");
                        }
                        if (segundos == 0){
                            
                            segundos=60;
                            
                            minutos-=1;
                            if (minutos==0){
                                alarma("Ejercicio Finalizado");
                                cronometroA=false;
                            }else{
                                alarma("Empezar");
                            
                            }
                        }
                    }
                    
                }
                
                }catch(Exception e){
                    //Cuando se reincie se coloca nuevamente en 00:00:000
                    alarma("error");
                }
    }
}            
            
    
    
    
    
