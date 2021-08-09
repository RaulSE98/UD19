package Ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel e;
	private JButton boton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		
		setTitle("Saludador");
		setBounds(100, 100, 330, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		e = new JLabel("Escribe un nombre para saludar");
		e.setBounds(60, 20, 300, 20);
		contentPane.add(e);
		
		textField = new JTextField();
		textField.setBounds(60, 67, 200, 20);
		contentPane.add(textField);
		
		boton = new JButton("¡Saludar!");
		boton.setBounds(110,90,100,20);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + textField.getText() + "!");
			}
		});
	}

}
