package metodos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Entrada extends JFrame {

	private JPanel contentPane;
	public TextField textField=null;
	public  JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada frame = new Entrada();
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
	public Entrada() {
		super("Trabajo Practico Matematica Superior");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseMemoria = new JLabel("Ingrese Memoria: ");
		lblIngreseMemoria.setBounds(25, 114, 136, 15);
		contentPane.add(lblIngreseMemoria);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBounds(0, 0, 95, 19);
		contentPane.add(mnMenu);
		
		 btnCalcular = new JButton("Calcular tiempo!");
//		btnCalcular.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				getMemoria();
//			}
//		});
		 ponerEventoAlBotonCalcular();
		btnCalcular.setBounds(181, 155, 117, 25);
		contentPane.add(btnCalcular);
		
		 textField = new TextField();
		textField.setBounds(181, 110, 142, 19);
		contentPane.add(textField);
	}
	
	private void ponerEventoAlBotonCalcular() {
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCalcular){
					new Tabla(getMemoria());
				}
				
			}
		});
	}

	public double getMemoria() {
		if(textField==null || textField.getText()=="") {
			this.mostrarError();
		}
		String memoria = textField.getText();
		double memoriav2 = Double.parseDouble(memoria);
		return memoriav2;
	}

	private void mostrarError() {
		JOptionPane.showMessageDialog(null, "Ingrese tamanio de memoria!");
	}
	
}
