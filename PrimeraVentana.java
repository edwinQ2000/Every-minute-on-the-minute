package timmer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Font;

public class PrimeraVentana extends JFrame {

	public JPanel contentPane;
	public JTextField tiempoTotal;
	public JTextField tiempoActividad;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraVentana frame = new PrimeraVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tiempoRutina = new JLabel("INGRESE EL TIEMPO TOTAL:");
		tiempoRutina.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tiempoRutina.setBounds(20, 88, 252, 37);
		contentPane.add(tiempoRutina);
		
		JLabel titulo = new JLabel("TEMPORIZADOR DE RUTINA");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		titulo.setBounds(10, 11, 414, 46);
		contentPane.add(titulo);
		
		tiempoTotal = new JTextField();
		tiempoTotal.setBounds(286, 93, 121, 28);
		contentPane.add(tiempoTotal);
		tiempoTotal.setColumns(10);
		
		JLabel tiempoActividadLb = new JLabel("INGRESE EL TIEMPO DE ACTIVIDAD:");
		tiempoActividadLb.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tiempoActividadLb.setBounds(20, 119, 259, 46);
		contentPane.add(tiempoActividadLb);
		
		tiempoActividad = new JTextField();
		tiempoActividad.setBounds(285, 132, 122, 28);
		contentPane.add(tiempoActividad);
		tiempoActividad.setColumns(10);
		
		JButton botonIngresar = new JButton("CONFIRMAR");
		botonIngresar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		botonIngresar.setBounds(151, 193, 128, 37);
		contentPane.add(botonIngresar);
		
		botonIngresar.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {  
				  
				  int total =  Integer.parseInt(tiempoTotal.getText());  
				  
				  int activo = Integer.parseInt(tiempoActividad.getText());
				  

				 SegundaVentana ventanaDos = new SegundaVentana(total,activo);
				 ventanaDos.setVisible(true); 		
				// ventanaDos.correr(total, activo);
			  
			  }
			  
			  
			});
	
		
    	

		}
}
	
