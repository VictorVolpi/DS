package lxmultimarcas;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.synth.ColorType;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.*;

public class Orcamento extends JFrame implements ItemListener {
	
	private static final ItemListener ItemListener = null;
	private JLabel lbimagem;
	private JLabel lbMarca;
	private JLabel lbModelo;
	private JLabel lbNome;
	private JLabel lbCelular;
	private JLabel lbEmail;
	private JLabel lbCores;
	private JLabel lbOpcionais;
	private JLabel lbArCondicionado;
	private JLabel lbDirecaoHidraulica;
	private JLabel lbRodasLigaLeve;
	private JLabel lbMultimidias;
	private JTextField txNome;
	private JTextField txCelular;
	private JTextField txEmail;
	private JComboBox cbMarca;
	private JComboBox cbModelo;
	private JRadioButton rdBranco;
	private JRadioButton rdCinza;
	private JRadioButton rdPreto;
	private ButtonGroup bgCores;
	private JCheckBox ckArCondicionado;
	private JCheckBox ckDirecaoHidraulica;
	private JCheckBox ckRodasLigaLeve;
	private JCheckBox ckMultimidias;
	private JButton btSalvar;
	private JButton btCancelar;
	private ImageIcon img;
	
	public Orcamento() {
		this.setTitle("Orçamento de Carros");
		this.setSize (800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.white);		
		
		JPanel painel = new JPanel() {
            @Override
            /* Criando um paint para desenha a imagem e chamar ela*/
            protected void paintComponent(Graphics g) {
            	/* Chamando a variavel "g" com o super*/
                super.paintComponent(g);
                Image img = new ImageIcon("src/martin.jpeg").getImage();
                /* drawImage serve para desenhar a imagem, como aumentar a imagem ou mexer ou eixo x e y*/
                g.drawImage(img, 0, 500, 300, 200, this);
            }
        };
        painel.setLayout(null);
	
		
		ImageIcon imagem = new ImageIcon(getClass().getResource(""));
		JLabel Label = new JLabel(imagem);
		
		lbNome= new JLabel();
		// x y largura altura
		lbNome.setBounds(10, 20, 100, 25);
		lbNome.setText("Nome");
		lbNome.setBackground(Color.white);
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(10, 40, 140, 25);
		txNome.setBackground(Color.white);
		add (txNome);
		
		lbCelular= new JLabel();
		lbCelular.setBounds(200, 22, 200, 25);
		lbCelular.setText("Celular");
		lbCelular.setBackground(Color.white);
		add(lbCelular);
		
		txCelular = new JTextField();
		txCelular.setBounds(200, 41, 150, 25);
		txCelular.setBackground(Color.white);
		add (txCelular);
		
		lbEmail= new JLabel();
		lbEmail.setBounds(400, 20, 400, 25);
		lbEmail.setText("Email");
		lbEmail.setBackground(Color.white);
		add(lbEmail);
		
		txEmail = new JTextField();
		txEmail.setBounds(400, 41, 150, 25);
		txEmail.setBackground(Color.white);
		add (txEmail);
		
		lbMarca= new JLabel();
		lbMarca.setBounds(10, 70, 200, 25);
		lbMarca.setText("Marca");
		lbMarca.setBackground(Color.white);
		add(lbMarca);
		
		cbMarca = new JComboBox();
		cbMarca.setBounds(50, 75, 150, 20);
		cbMarca.addItem("Marca");
		cbMarca.addItem("Ferrari");
		cbMarca.addItem("Nissan");
		cbMarca.addItem("Porsche");
		cbMarca.addItemListener(this);
		add(cbMarca);
		
		lbModelo= new JLabel();
		lbModelo.setBounds(5, 140, 200, 25);
		lbModelo.setText("Modelo");
		lbModelo.setBackground(Color.white);
		add(lbModelo);

		cbModelo = new JComboBox();
		cbModelo.setBounds(50, 140, 150, 20);
		cbModelo.addItem("Modelo");
		add(cbModelo);
		
		lbCores= new JLabel();
		lbCores.setBounds(20, 190, 200, 25);
		lbCores.setText("Cores: ");
		lbCores.setBackground(Color.white);
		add(lbCores);
		
		rdBranco = new 	JRadioButton();
		rdBranco.setBounds(19, 220, 100, 20);
		rdBranco.setText("Branca");
		rdBranco.setBackground(Color.white);
		add(rdBranco);
		
		rdCinza = new 	JRadioButton();
		rdCinza.setBounds(20, 250, 100, 20);
		rdCinza.setText("Cinza");
		rdCinza.setBackground(Color.white);
		add(rdCinza);
		
		rdPreto = new 	JRadioButton();
		rdPreto.setBounds(20, 280, 100, 20);
		rdPreto.setText("Preto");
		rdPreto.setBackground(Color.white);
		add(rdPreto);
		
		bgCores = new ButtonGroup();
		bgCores.add(rdBranco);
		bgCores.add(rdCinza);
		bgCores.add(rdPreto);
		
		lbOpcionais= new JLabel();
		lbOpcionais.setBounds(20, 320, 200, 25);
		lbOpcionais.setText("Opcionais: ");
		lbOpcionais.setBackground(Color.white);
		add(lbOpcionais);
		
		lbArCondicionado= new JLabel();
		lbArCondicionado.setBounds(40, 340, 200, 25);
		lbArCondicionado.setText("ArCondicionado");
		lbArCondicionado.setBackground(Color.white);
		add(lbArCondicionado);
		
		lbDirecaoHidraulica = new JLabel();
		lbDirecaoHidraulica.setBounds(40, 360, 200, 25);
		lbDirecaoHidraulica.setText("DirecaoHidraulica");
		lbDirecaoHidraulica.setBackground(Color.white);
		add(lbDirecaoHidraulica);
		
		lbRodasLigaLeve = new JLabel();
		lbRodasLigaLeve.setBounds(40, 380, 200, 25);
		lbRodasLigaLeve.setText("RodasLigaLeve");
		lbRodasLigaLeve.setBackground(Color.white);
		add(lbRodasLigaLeve);
		
		lbMultimidias = new JLabel();
		lbMultimidias.setBounds(40, 400, 200, 25);
		lbMultimidias.setText("Multimidias");
		lbMultimidias.setBackground(Color.white);
		add(lbMultimidias);
		
		ckArCondicionado = new JCheckBox();
		ckArCondicionado.setBounds(15, 340, 20, 25);
		ckArCondicionado.setBackground(Color.white);
		add(ckArCondicionado);
		
		ckDirecaoHidraulica = new JCheckBox();
		ckDirecaoHidraulica.setBounds(15, 360, 20, 25);
		ckDirecaoHidraulica.setBackground(Color.white);
		add(ckDirecaoHidraulica);
		
		ckRodasLigaLeve = new JCheckBox();
		ckRodasLigaLeve.setBounds(15, 380, 20, 25);
		ckRodasLigaLeve.setBackground(Color.white);
		add(ckRodasLigaLeve);
		
		ckMultimidias = new JCheckBox();
		ckMultimidias.setBounds(15, 400, 20, 25);
		ckMultimidias.setBackground(Color.white);
		add(ckMultimidias);
		
		btSalvar = new JButton();
		btSalvar.setBounds(270, 500, 110, 25);
		btSalvar.setText("Salvar");
		btSalvar.setBackground(Color.white);
		add(btSalvar);
		
		btCancelar = new JButton();
		btCancelar.setBounds(400, 500, 110, 25);
		btCancelar.setText("Cancelar");
		btCancelar.setBackground(Color.white);
		add(btCancelar);
		
		add(Label);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
		
		
		// por último
		this.setLayout(null);
		this.setVisible(true);
	}
	private void MostrarImg() {
			String alimentoSelected = (String) cbMarca.getSelectedItem();
			cbModelo.removeAllItems();
			
			if("Ferrari".equals(alimentoSelected)) {
				cbModelo.addItem("Ferrari 458 Italia");
				cbModelo.addItem("Ferrari 488");
			}else if ("Nissan".equals(alimentoSelected)) {
				cbModelo.addItem("Nissan GTR-34 skyline");
				cbModelo.addItem("Nissan GTR-35");
			}if ("Porsche".equals(alimentoSelected)) {
				cbModelo.addItem("Porsche Panamera");
				cbModelo.addItem("Porsche 911");
			}
	}
	
	public void actionPerformed (ActionEvent e) {
		 if (e.getSource() == cbMarca) {
			 
	            // Atualizar os modelos com base na marca selecionada
			 String selectedMarca = (String) cbMarca.getSelectedItem();
			 
			 if (selectedMarca != null) {
				 updateModelComboBox(selectedMarca);
	            }
			 atualizarImagem();
		 } else if (e.getSource() == rdBranco || e.getSource() == rdPreto || e.getSource() == rdCinza) {
	            // Chame o método para atualizar a imagem do carro
	            atualizarImagem();
		 } else if (e.getSource() == btSalvar) {
	            // Obter as escolhas do usuário
	            String nome = txNome.getText();
	            String celular = txCelular.getText();
	            String email = txEmail.getText();
	            String marca = (String) cbMarca.getSelectedItem();
	            String modelo = (String) cbModelo.getSelectedItem();
	            String cor = rdBranco.isSelected() ? "Branco" : rdPreto.isSelected() ? "Preto" : "Cinza";
	            String opcoes = "";
	            
	            if (ckArCondicionado.isSelected()) opcoes += "Ar-condicionado, ";
	            if (ckDirecaoHidraulica.isSelected()) opcoes += "Direção Hidráulica, ";
	            if (ckRodasLigaLeve.isSelected()) opcoes += "Rebaixamento, ";
	            if (ckMultimidias.isSelected()) opcoes += "Luzes";

	            opcoes = opcoes.isEmpty() ? "Nenhum opcional selecionado" : opcoes;
	            
	         // Montar a mensagem para exibir no JOptionPane
	            String message = "Nome: " + nome + "\n" +
	                    "Celular: " + celular + "\n" +
	                    "E-mail: " + email + "\n" +
	                    "Marca: " + marca + "\n" +
	                    "Modelo: " + modelo + "\n" +
	                    "Cor: " + cor + "\n" +
	                    "Opcionais: " + opcoes;
	            
	            JOptionPane.showMessageDialog(this,
	                    message, "Orçamento Enviado", JOptionPane.INFORMATION_MESSAGE);
	            
		 } else if (e.getSource() == btCancelar) {
	            // Lidar com o botão de cancelamento, redefinir todas as opções
	            txNome.setText("");
	            txCelular.setText("");
	            txEmail.setText("");
	            cbMarca.setSelectedIndex(0);
	            cbModelo.removeAllItems();
	            rdBranco.setSelected(false);
	            rdPreto.setSelected(false);
	            rdCinza.setSelected(false);
	            lbimagem.setIcon(null);
	            ckArCondicionado.setSelected(false);
	            ckDirecaoHidraulica.setSelected(false);
	            ckRodasLigaLeve.setSelected(false);
	            ckMultimidias.setSelected(false);
	        }
	    
	
	rdPreto.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			
			String marca = cbMarca.getItemSelectedItem().toString;
			String modelo = cbModelo.getItemSelectedItem().toString;
			
			if (marca.equals("Ferrari")) {
		
				if (modelo.equals("458 Italia")) {
			
					ImageIcon imgFerrari458ItaliaPreto = new ImageIcon(getClass().getResource("ferrari 458 italia preta.jpg"));
					imgFerrari458ItaliaPreto.setImage(imgFerrari458ItaliaPreto.getImage().getScaledInstance(lbimagem.getWidth(),
					lbimagem.getHeight(),1));
					lbimagem.setIcon(imgFerrari458ItaliaPreto);
			
				}else {
			
					ImageIcon imgFerrari488Preto = new ImageIcon(getClass().getResource("ferrari 488 preta.jpg"));
					imgFerrari488Preto.setImage(imgFerrari488Preto.getImage().getScaledInstance(lbimagem.getWidth(),
					lbimagem.getHeight(),1));
					lbimagem.setIcon(imgFerrari488Preto);
			
				}
			}else if (marca.equals("Nissan")) {
		
				if (modelo.equals("GTR-35")) {
			
					ImageIcon imgNissanGtr35Preto = new ImageIcon(getClass().getResource("nissan gtr35 preto.jpg"));
					imgNissanGtr35Preto.setImage(imgNissanGtr35Preto.getImage().getScaledInstance(lbimagem.getWidth(),lbimagem.getHeight(),1));
					lbimagem.setIcon(imgNissanGtr35Preto);
			
				}else {
					ImageIcon imgNissanGtr34Preto = new ImageIcon(getClass().getResource("nissan gtr34 preto.jpg"));
					imgNissanGtr34Preto.setImage(imgNissanGtr34Preto.getImage().getScaledInstance(lbimagem.getWidth(),lbimagem.getHeight(),1));
					lbimagem.setIcon(imgNissanGtr34Preto);
					}	
				}else {
		
					if (modelo.equals("Porsche")) {
			
						ImageIcon imgPorsche911Preto = new ImageIcon(getClass().getResource("porsche 911 preta.jpg"));
						imgPorsche911Preto.setImage(imgPorsche911Preto.getImage().getScaledInstance(lbimagem.getWidth(),lbimagem.getHeight(),1));
						lbimagem.setIcon(imgPorsche911Preto);
					}
				}else {
					ImageIcon imgPorschePanameraPreto = new ImageIcon(getClass().getResource("porsche panamera preta.jpg"));
					imgPorschePanameraPreto.setImage(imgPorschePanameraPreto.getImage().getScaledInstance(lbimagem.getWidth(),lbimagem.getHeight(),1));
					lbimagem.setIcon(imgPorschePanameraPreto);
				}
			}
		}
	};
		
	private void atualizarImagem() {
		atualizarImagem();
		
	}
	private void updateModelComboBox(String selectedBrand) {
		cbModelo.removeAllItems();
        if ("Ferrari 458 Italia".equals(selectedBrand)) {
        	cbModelo.addItem("Ferrari 488");
        } else if ("Jeep".equals(selectedBrand)) {
        	cbModelo.addItem("Nissan GTR-34 skyline");
        	cbModelo.addItem("Nissan GTR-35");
        } else if ("Volkswagen".equals(selectedBrand)) {
        	cbModelo.addItem("Porsche Panamera");
        	cbModelo.addItem("Porsche 911");
        }     
    }
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		MostrarImg();
		
	}
}
