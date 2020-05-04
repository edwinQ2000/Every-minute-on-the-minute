package timmer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SegundaVentana extends JFrame implements Runnable{

	public JPanel contentPane;
	public String estado;
	public int total,activo;
	public boolean cronometroA;
	public JLabel estadoText;
	/**
	 * Launch the application.
	 */
	
	public SegundaVentana(int total, int activo) {
		
		this.total=total;
		this.activo=activo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tiempoSeleccionado = new JLabel("TIEMPO DE ENTRENAMIENTO: " + total + "min" );
		tiempoSeleccionado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tiempoSeleccionado.setBounds(42, 40, 296, 30);
		contentPane.add(tiempoSeleccionado);
		
		JLabel reposoText = new JLabel("TIEMPO DE REPOSO ELEGIDO: " + (60-activo) + "seg");
		reposoText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		reposoText.setBounds(348, 40, 272, 30);
		contentPane.add(reposoText);
		
		estadoText = new JLabel("EL ESTADO ES : EN ACTIVIDAD ");
		estadoText.setHorizontalAlignment(SwingConstants.CENTER);
		estadoText.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		estadoText.setBounds(0, 142, 620, 30);
		contentPane.add(estadoText);
		
		Thread hilo = new Thread( this );
        hilo.start();
		
			}
	
	 public void alarma(String sms){
	        
		 estadoText.setText("EL ESTADO ES : " + sms);
		 
	    }
	    
	@Override
	public void run() {
	
		        int minutos=total,segundos=60,milesimas=0;
		        
		           try{
		               cronometroA=true;
		                while (cronometroA){
		                    Thread.sleep(3);
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
		                           alarma("EN DESCANSO");
		                        }
		                        if (segundos == 0){
		                            
		                            segundos=60;
		                            
		                            minutos-=1;
		                            if (minutos==0){
		                                alarma("Ejercicio Finalizado");
		                                cronometroA=false;
		                            }else{
		                                alarma("EN ACTIVIDAD");
		                            
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
