package gui_tabla;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import algoritmos.Algoritmo;

import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.BoxLayout;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public Object[][] data; 
	public JScrollPane scrollPane =null;
	public Algoritmo algoritmo=null;
	private JTable table_1;
	public String nombreDeTabla;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
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
//	public Tabla() {
//		setTitle("TRABAJO PRACTICO MAT SUPERIOR");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		getContentPane().setLayout(null);
//		
//		table =crearTabla();
//		
//		
//		 scrollPane_1 = new JScrollPane(table);
//		 scrollPane_1.setBounds(0, 0, 434, 261);
//		getContentPane().add(scrollPane_1);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(new BorderLayout(0, 0));	
//	}
	public Tabla() {
		setBounds(100, 100, 290, 224);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		table_1 = crearTabla();
		getContentPane().add(table_1, BorderLayout.WEST);
		scrollPane = new JScrollPane(table_1);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	public Tabla(Object[][] matrizDeResultados) {
		setBounds(100, 100, 290, 224);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		table_1 = crearTabla(matrizDeResultados);
		getContentPane().add(table_1, BorderLayout.WEST);
		scrollPane = new JScrollPane(table_1);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	private JTable crearTabla(Object[][] matrizDeResultados) {
		data=matrizDeResultados;
	     String[] columnNames = {"n","xn","f(xn)"};
	    return new JTable(data, columnNames);
	}

	private JTable crearTabla() {
		 data= crearMatrizEjemplo();
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
	public Object[][] crearMatrizDeNumeros_criterio1(Algoritmo algoritmo) {
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
	public Object[][] crearMatrizEjemplo() {
		
		Object[][] aux ={
				{1,"uno","x"},
				{2,"dos","y"},
				{3,"tres","z"},
				{1,"uno","x"},
				{2,"dos","y"},
				{1,"uno","x"},
				{2,"dos","y"},
				{1,"uno","x"},
				{2,"dos","y"},
				{1,"uno","x"},
				{2,"dos","y"},
				};
		return aux;
	}
//	public static void main(String[] args) {
//		Object[][] aux ={
//			{1,"uno","x"},
//			{2,"dos","y"},
//			{3,"tres","z"}		};
//		System.out.println(aux);
//	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public Object[][] getData() {
		return data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}



	public Algoritmo getAlgoritmo() {
		return algoritmo;
	}

	public void setAlgoritmo(Algoritmo algoritmo) {
		this.algoritmo = algoritmo;
	}
}
	
