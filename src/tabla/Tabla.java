package tabla;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import algoritmos.Algoritmo;

import javax.swing.JTable;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public Object[][] data; 
	JScrollPane scrollPane =null;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Tabla frame = new Tabla();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Tabla() {
		setTitle("TRABAJO PRACTICO MAT SUPERIOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		table =crearTabla();
		contentPane.add(table);
		
		table.setBounds(197, 62, 145, 120);
		contentPane.add(table);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(22, 62, 330, 120);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(table); // 22:36
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 22:36
	
		
		setVisible(true);
	}

	private JTable crearTabla() {
		 data= crearMatrizDeNumeros1();
	     String[] columnNames = {"n","xn","f(xn)"};
	    return new JTable(data, columnNames);
	}
	public Object[][] crearMatrizDeNumeros1(){
		
		Object[][] matriz =null;
//			{
//				{notas().get(0).getNroExamen(),notas().get(0).getDescrLetras(),notas().get(0).getValor()},
//				{notas().get(1).getNroExamen(),notas().get(1).getDescrLetras(),notas().get(1).getValor()},
//				{notas().get(2).getNroExamen(),notas().get(2).getDescrLetras(),notas().get(2).getValor()}			
//		}; // con for(;;) tira error a morir
		return matriz;
	}
	public Object[][] crearMatrizDeNumeros(ArrayList<String> lista_de_n,ArrayList<String> lista_de_xn,ArrayList<String> lista_de_f_xn) {
		int cantFilas = lista_de_n.size();
		int cantColumnas=2;
		Object[][] matriz = new Object[cantFilas][3];
		for (int i = 0; i < cantFilas; i++) {
			 matriz[i][0] =lista_de_n.get(i);
			 matriz[i][1] =lista_de_xn.get(i);
			 matriz[i][2] =lista_de_f_xn.get(i);		
		}
		return matriz;
	}
	public Object[][] crearMatrizDeNumeros_1(Algoritmo algoritmo) {
		algoritmo.correrConCriterioDeParo1();
		ArrayList<String> lista_de_n=algoritmo.getLista_de_n();
		ArrayList<String> lista_de_xn=algoritmo.getLista_de_xn();
		ArrayList<String> lista_de_f_xn=algoritmo.getLista_de_f_xn();
		int cantFilas = lista_de_n.size();
		int cantColumnas=2;
		Object[][] matriz = new Object[cantFilas][3];
		for (int i = 0; i < cantFilas; i++) {
			 matriz[i][0] =lista_de_n.get(i);
			 matriz[i][1] =lista_de_xn.get(i);
			 matriz[i][2] =lista_de_f_xn.get(i);		
		}
		return matriz;
	}
	public static void main(String[] args) {
		Object[][] aux ={
			{1,"uno","x"},
			{2,"dos","y"},
			{3,"tres","z"}		};
		System.out.println(aux);
	}
}
	
