/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmer;

/**
 *
 * @author Edwin
 */
public class control {
    public int total,activo,pausa;
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timmer;

/**
 *
 * @author Edwin
 */
public class control {
    public int total,activo,pausa;
    public boolean cronometroA,cronometroB;
  
    public control(int total,int activo,int pausa){
        this.total=total;
        this.activo=activo;
        this.pausa=pausa;
        
        
        
    }
    
    public void alarma(){
        
        
    }
    
    public void correr() throws InterruptedException{
        int minutos=total,segundos=activo,milesimas=0;
          while(cronometroB){
                
                while (cronometroA){
                    Thread.sleep( 4 );
                    //Incrementamos 4 milesimas de segundo
                    milesimas += 4;

                    //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
                    //y las milesimas de segundo de nuevo a 0
                    if( milesimas == 1000 ){
                        milesimas = 0;
                        segundos -= 1;
                        //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                        //y los segundos vuelven a 0
                        if( segundos == 0 ){
                           alarma();
                           cronometroA=false;
                        }
                    }
                    
                }
                
            }
    
    }
    
    
}

    public control(int total,int activo,int pausa){
        this.total=total;
        this.activo=activo;
        this.pausa=pausa;
        
        
        
    }
    
    public void alarma(){
        
    }
    
    
}
