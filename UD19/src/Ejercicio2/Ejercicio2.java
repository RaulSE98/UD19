package Ejercicio2;

import java.awt.BorderLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel e;
	private JLabel e2;
	private JButton boton;
	private JComboBox combo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		
		setTitle("Películas");
		setBounds(100, 100, 550, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		e = new JLabel("Escribe el titulo de una pelicula");
		e.setBounds(76, 39, 184, 20);
		contentPane.add(e);
		
		e2 = new JLabel("Peliculas");
		e2.setBounds(380, 39, 61, 20);
		contentPane.add(e2);
		
		textField = new JTextField();
		textField.setBounds(60, 67, 200, 20);
		contentPane.add(textField);
		
		combo = new JComboBox<>();
		combo.setBounds(358,70,113,20);
		contentPane.add(combo);
		combo.addItem("Avatar");
		
		boton = new JButton("Añadir");
		boton.setBounds(76,116,80,20);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				combo.addItem(textField.getText());
			}
		});
	}
	}


