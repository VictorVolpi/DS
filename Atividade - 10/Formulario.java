package interfacesGraficas;

import javax.swing.*;

import java.awt.Color;

public class Formulario extends JFrame {
	
	JLabel lbNome;
	JTextField txNome;
	JButton btSalvar;
	int numero;
	
	public Formulario() {
		
		this.setTitle("Formulário");
		this.setSize(800, 600);
		this.setLocation(100, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.BLACK);
		
		lbNome = new JLabel();
						// x, y, width, height
		lbNome.setBounds(20, 20, 100, 25);
		lbNome.setText("Nome");
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(20, 120, 100, 25);
		add(txNome);
		
		btSalvar = new JButton();
		btSalvar.setBounds(20, 200, 100, 25);
		btSalvar.setText("Salvar");
		btSalvar.setBackground(Color.BLUE);
		btSalvar.setForeground(Color.RED);
		add(btSalvar);
		
		
		// sempre por último
		this.setLayout(null);
		this.setVisible(true);
	}
}
