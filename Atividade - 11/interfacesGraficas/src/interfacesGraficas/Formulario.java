package interfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {
	
	JLabel lbNumero1;
	JLabel lbNumero2;
	JTextField txNumero1;
	JTextField txNumero2;
	JButton btSoma;
	JButton btSubtracao;
	JButton btMultiplicacao;
	JButton btDivisao;
	
	public Formulario() {
		
		this.setTitle("Calculadora Básica");
		this.setSize(500, 200);
		this.setLocation(100, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		
		lbNumero1 = new JLabel();
						// x, y, width, height
		lbNumero1.setBounds(20, 30, 100, 25);
		lbNumero1.setText("Número 1");
		add(lbNumero1);
		
		lbNumero2 = new JLabel();
		lbNumero2.setBounds(20, 60, 100, 25);
		lbNumero2.setText("Número 2");
		add(lbNumero2);
		
		txNumero1 = new JTextField();
		txNumero1.setBounds(80, 30, 100, 25);
		add(txNumero1);
		
		txNumero2 = new JTextField();
		txNumero2.setBounds(80, 60, 100, 25);
		add(txNumero2);
		
		btSoma = new JButton();
		btSoma.setBounds(20, 100, 100, 25);
		btSoma.setText("Soma");
		btSoma.setBackground(Color.BLACK);
		btSoma.setForeground(Color.WHITE);
		add(btSoma);

		btSoma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(txNumero1.getText());
				JOptionPane.showMessageDialog(null, numero1);

				double numero2 = Double.parseDouble(txNumero2.getText());
				JOptionPane.showMessageDialog(null, numero2);
			
				JOptionPane.showMessageDialog(null, numero1 + numero2);
			}
		});

		btSubtracao = new JButton();
		btSubtracao.setBounds(130, 100, 100, 25);
		btSubtracao.setText("Subtração");
		btSubtracao.setBackground(Color.BLACK);
		btSubtracao.setForeground(Color.WHITE);
		add(btSubtracao);

		btMultiplicacao = new JButton();
		btMultiplicacao.setBounds(240, 100, 100, 25);
		btMultiplicacao.setText("Multiplicação");
		btMultiplicacao.setBackground(Color.BLACK);
		btMultiplicacao.setForeground(Color.WHITE);
		add(btMultiplicacao);

		btDivisao = new JButton();
		btDivisao.setBounds(350, 100, 100, 25);
		btDivisao.setText("Divisão");
		btDivisao.setBackground(Color.BLACK);
		btDivisao.setForeground(Color.WHITE);
		add(btDivisao);
		
		// sempre por último
		this.setLayout(null);
		this.setVisible(true);
	}
}
