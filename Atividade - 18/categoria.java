import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import java.awt.*;
public class categoria extends JDialog  {
	
	JLabel lbTitle, lbCateg;
	JTextField txCat;
	JButton btSalvar;
	
	public categoria () {
		this.setTitle("Categoria");
		this.setSize (500,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.getContentPane().setBackground(Color.lightGray);
		this.setModal(true);
		
		lbTitle = new JLabel ();
		lbTitle.setBounds(190, 10, 200, 25);
		lbTitle.setText("Gerenciar Categorias");
		lbTitle.setBackground(Color.white);
		add(lbTitle);
		
		lbCateg = new JLabel();
		lbCateg.setBounds(80, 50, 200, 25);
		lbCateg.setText("Categoria: ");
		lbCateg.setBackground(Color.white);
		add(lbCateg);
		
		txCat = new JTextField();
		txCat.setBounds(150, 50, 200, 25);
		add(txCat);
		
		btSalvar= new JButton();
		btSalvar.setBounds(290, 110, 100, 25);
		btSalvar.setText("Salvar");
		add(btSalvar);
		
		btSalvar.addActionListener(new ActionListener() {
			public void actioPerformed(ActionEvent e) {
				
				Statement state;
				
				Conexao conex = new Conexao();
				
				String sql = "insert into tbCategoria values(null,'"+ txCat.getText()+"')";
				
				conex.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
				}
				catch(SQLException erro) {
					System.out.println ("Não foi possivel realizar a inseção");
				}
				conex.desconectar();
				
			}
		});
	

		this.setLayout(null);
		this.setVisible(true);
	}
 
	

}
