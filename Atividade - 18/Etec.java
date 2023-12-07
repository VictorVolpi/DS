import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;	
public class Etec extends JFrame  {
	
	JMenuBar window;
	JMenu arquivo, cadastrar, visu, ajuda;
	JMenuItem sair, categoria, produto, categoria2, produto2, sobre;
	
	
	public Etec() {
		this.setTitle("ETEC Guaianases");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		arquivo = new JMenu ("Arquivo");
		cadastrar = new JMenu ("Cadastrar");
		visu = new JMenu ("Visualizar");
		ajuda = new JMenu ("Ajuda	");
		
		sair = new JMenuItem ("Sair");
		categoria = new JMenuItem ("Categoria");
		
		categoria.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				categoria cacetadas = new categoria();
				cacetadas.setVisible(true);
			}
		});
		 
	
			
		
		produto = new JMenuItem ("Produto");
		produto.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produto patatadas = new produto();
				patatadas.setVisible(true);
			}
		});
		categoria2 = new JMenuItem ("Categoria");
		produto2 = new JMenuItem ("Produto");
		
		sobre = new JMenuItem ("Sobre");
		sobre.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sobre patetas = new sobre();
				patetas.setVisible(true);
			}
		});
		
		window = new JMenuBar();
		this.setJMenuBar(window);
		window.add(arquivo);
		window.add(cadastrar);
		window.add(visu);
		window.add(ajuda);
		
		arquivo.add(sair);
		cadastrar.add(categoria);
		cadastrar.add(produto);
		visu.add(categoria2);
		visu.add(produto2);
		ajuda.add(sobre);
			
		this.setVisible(true);		
	}

	
	
	
}
