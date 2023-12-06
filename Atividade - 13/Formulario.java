package LojaCarro;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

public class Formulario extends JFrame {
	JLabel lbCelular;
	JTextField txCelular;
	JLabel lbEmail;
	JLabel lbNomeEmpresa;
	JTextField txEmail;
	JLabel lbNome;
	JTextField txNome;
	JButton btExibir;
	JButton btCancelar;
	JLabel lbMarca;
	JLabel lbModelo;
	JComboBox cbMarca;
	JComboBox cbModelo;
	JRadioButton rdCor1 ;
	JRadioButton rdCor2 ;
	JRadioButton rdCor3;
	ButtonGroup bgTurma;
	ButtonGroup bgOpicionais;
	JCheckBox ckOpicionais1;
	JCheckBox ckOpicionais2;
	JCheckBox ckOpicionais3;
	JCheckBox ckOpicionais4;

	public Formulario () {
		
		this.setTitle("Top Speed");
		this.setSize (900,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		lbNomeEmpresa = new JLabel();
		lbNomeEmpresa.setBounds(25,25,500,35);
		//lbNomeEmpresa.setText("VENHA FAZER SEU ORÇAMENTO NA TOP SPEED");
		//lbNomeEmpresa.setFont(new font("century gothic"));
		add(lbNomeEmpresa);
		
		lbNome = new JLabel();
		lbNome.setBounds(20,20,100,20);
		 //primeiro mexe o lado segundo decima para baixox Terceiro mexer o nome
		lbNome.setText("Digite seu nome: ");
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(20,40,100,20);
		add(txNome);
		
		
		lbCelular = new JLabel();
		lbCelular.setBounds (150,20,150,20);
		lbCelular.setText("Digite seu telefone ");
		add(lbCelular);
		
		txCelular = new JTextField();
		txCelular.setBounds(150,40,100,20);
		add(txCelular);
		
		lbEmail = new JLabel();
		lbEmail.setBounds (280,20,100,20);
		lbEmail.setText("Digite seu Email ");
		add(lbEmail);
		
		txEmail = new JTextField();
		txEmail.setBounds(280,40,100,20);
		add(txEmail);
		
		
		btExibir = new JButton();	
		btExibir.setBounds(20,300,100,40);
		btExibir.setText("Exibir");
		btExibir.setBackground(Color.BLACK);
		btExibir.setForeground(Color.white);
		add(btExibir);
		
		btCancelar = new JButton();	
		btCancelar.setBounds(150,300,100,40);
		btCancelar.setText("Cancelar");
		btCancelar.setBackground(Color.BLACK);
		btCancelar.setForeground(Color.white);
		
		add(btCancelar);
		
		btExibir.addActionListener(new ActionListener() {
	
			
			public void actionPerformed(ActionEvent e) {
			String nome, SuaMarca, CorCarro="", adicionais="";
			nome = txNome.getText();
			SuaMarca = cbMarca.getSelectedItem().toString();
			
			if(rdCor1.isSelected()) {
				CorCarro = rdCor1 .getText();
			}else if(rdCor2 .isSelected()) {
				CorCarro = rdCor2.getText();
			}else {
				CorCarro = rdCor3.getText();
			}
			if(ckOpicionais1.isSelected()) {
				adicionais = adicionais +" "+ckOpicionais1.getText();
			}
			if(ckOpicionais2.isSelected()) {
				adicionais = adicionais +" "+ckOpicionais2.getText();
			}
			if(ckOpicionais3.isSelected()) {
				adicionais = adicionais +" "+ckOpicionais3.getText();
			}
			JOptionPane.showMessageDialog(null,"Seu Nome: "+ nome + "\nSeu Contato:" + "\nSeu Email:" + 
			"\nSua Marca: " +SuaMarca+ "\nSeu Modelo:" + "\nCor de seu Carro:" +CorCarro+  "\nAdicionais: "+adicionais);
			}
		});
		lbMarca = new JLabel();
		lbMarca.setBounds (20,70,150,20);
		lbMarca.setText("Escolha a marca: ");
		add(lbMarca);
		
		cbMarca = new JComboBox();
		cbMarca.setBounds(140,70,150,20);
		cbMarca.addItem("Selecione...");
		cbMarca.addItem("Porsche");
		cbMarca.addItem("Bmw");
		cbMarca.addItem("Lamborghini");
	
		add(cbMarca);
		
		lbModelo = new JLabel();
		lbModelo.setBounds (20,100,150,20);
		lbModelo.setText("Escolha o Modelo ");
		add(lbModelo);
		
		cbModelo = new JComboBox();
		cbModelo.setBounds(140,100, 150,20);
		cbModelo.addItem("Modelo");
		//cbModelo.addItem("Porsche Panamera");
		//cbModelo.addItem("Porsche 911");
		//cbModelo.addItem("BMW I8");
		//cbModelo.addItem("BMW X6");
	//	cbModelo.addItem("Lamborghini Aventador");
	//	cbModelo.addItem("Lamborghini Urus");
			add(cbModelo);
		
		rdCor1 = new JRadioButton();
		rdCor1 .setBounds(20,150,100,20);
		rdCor1 .setText("Branco");
		add(rdCor1 );
		
		rdCor2  = new JRadioButton();
		rdCor2 .setBounds(120,150,100,20);
		rdCor2 .setText("Prata");
		add(rdCor2);
		
		rdCor3  = new JRadioButton();
		rdCor3 .setBounds(200,150,100,20);
		rdCor3 .setText("Preto");
		add(rdCor3);
		
		bgTurma = new ButtonGroup();
		bgTurma.add(rdCor1 );
		bgTurma.add(rdCor2 );
		bgTurma.add(rdCor3);
		
		ckOpicionais1 = new JCheckBox();
		ckOpicionais1.setBounds(20, 200, 150, 20);
		ckOpicionais1.setText("Ar Condicionado");
		add(ckOpicionais1);

		ckOpicionais2 = new JCheckBox();
		ckOpicionais2.setBounds(20, 230, 150, 20);
		ckOpicionais2.setText("Direção Hidraulica");
		add(ckOpicionais2);
		
		ckOpicionais3= new JCheckBox();
		ckOpicionais3.setBounds(200, 200, 250, 20);
		ckOpicionais3.setText("Rodas Liga Leve");
		add(ckOpicionais3);
		
		ckOpicionais4= new JCheckBox();
		ckOpicionais4.setBounds(200, 230, 250, 20);
		ckOpicionais4.setText("Kit Multimidia");
		add(ckOpicionais4);
		
		bgOpicionais = new ButtonGroup();
		bgOpicionais.add(ckOpicionais1);
		bgOpicionais.add(ckOpicionais2);
		bgOpicionais.add(ckOpicionais3);
		bgOpicionais.add(ckOpicionais4);
		
		
		this.setVisible(true);
		
	}



	private void MostrarImg() {
		String alimentoSelected = (String) cbMarca.getSelectedItem();
		cbModelo.removeAllItems();
		
		if ("Porsche".equals(alimentoSelected)) {
			cbModelo.addItem("Porsche 911");
			cbModelo.addItem("Porsche Panamera");
		}else if ("BMW".equals(alimentoSelected)) {
				cbModelo.addItem("BMW X6");
				cbModelo.addItem("BMW I8");
			}if ("Lamborghini".equals(alimentoSelected)) {
					cbModelo.addItem("Lamborghini Aventador");
					cbModelo.addItem("Lamborghini Urus");
			
		}
	}
}




	
