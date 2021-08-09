package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JButton suma;
	private JButton resta;
	private JButton multi;
	private JButton divi;
	private JButton igual;
	private JButton salir;
	private JLabel texto1;
	private JTextField num1;
	private JLabel texto2;
	private JTextField num2;
	private JLabel texto3;
	private JTextField num3;
	private double resultado = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		setTitle("MiniCalculadora");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		suma = new JButton("+");
		suma.setBounds(248,66,47,37);
		contentPane.add(suma);
		suma.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
			}
		});
		
		resta = new JButton("-");
		resta.setBounds(300,66,47,37);
		contentPane.add(resta);
		resta.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
			}
		});
		
		multi = new JButton("x");
		multi.setBounds(248,114,47,37);
		contentPane.add(multi);
		multi.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
			}
		});
		
		divi = new JButton("/");
		divi.setBounds(300,114,47,37);
		contentPane.add(divi);
		divi.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
			}
		});
		
		igual = new JButton("=");
		igual.setBounds(248,162,99,37);
		contentPane.add(igual);
		igual.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				texto3 = new JLabel("Resutaldo: " + resultado);
				texto3.setBounds(58, 217, 181, 20);
				contentPane.add(texto3);
				
				num3 = new JTextField(String.valueOf(resultado));
				num3.setBounds(58, 66, 143, 20);
				contentPane.add(num3);
			}
			});

		
		salir = new JButton("Salir");
		salir.setBounds(248,210,99,34);
		contentPane.add(salir);
		salir.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ha salido");
			}
		});
		
		texto1 = new JLabel("Num 1");
		texto1.setBounds(58, 43, 81, 20);
		contentPane.add(texto1);
		
		num1 = new JTextField();
		num1.setBounds(58, 66, 143, 20);
		contentPane.add(num1);
		
		texto2 = new JLabel("Num 2");
		texto2.setBounds(58, 105, 81, 20);
		contentPane.add(texto2);
		
		num2 = new JTextField();
		num2.setBounds(58, 131, 143, 20);
		contentPane.add(num2);
	}

}
