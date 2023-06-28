import javax.swing.JOptionPane;
 class Agenda {
	    private Contato[] contatos;
	    private Aniversario[] aniversarios;
	    private Prova[] provas;
	    private Trabalho[] trabalhos;
	    private int quantidadeContatos;
	    private int quantidadeAniversarios;
	    private int quantidadeProvas;
	    private int quantidadeTrabalhos;

	    public Agenda() {
	        contatos = new Contato[100];
	        aniversarios = new Aniversario[100];
	        provas = new Prova[100];
	        trabalhos = new Trabalho[100];
	        quantidadeContatos = 0;
	        quantidadeAniversarios = 0;
	        quantidadeProvas = 0;
	        quantidadeTrabalhos = 0;
	    }

	    public void adicionarContato(Contato contato) {
	        if (quantidadeContatos < 100) {
	            contatos[quantidadeContatos] = contato;
	            quantidadeContatos++;
	            JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "A agenda est� cheia!");
	        }
	    }

	    public void adicionarAniversario(Aniversario aniversario) {
	        if (quantidadeAniversarios < 100) {
	            aniversarios[quantidadeAniversarios] = aniversario;
	            quantidadeAniversarios++;
	            JOptionPane.showMessageDialog(null, "Anivers�rio adicionado com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "A lista de anivers�rios est� cheia!");
	        }
	    }

	    public void adicionarProva(Prova prova) {
	        if (quantidadeProvas < 100) {
	            provas[quantidadeProvas] = prova;
	            quantidadeProvas++;
	            JOptionPane.showMessageDialog(null, "Prova adicionada com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "A lista de provas est� cheia!");
	        }
	    }

	    public void adicionarTrabalho(Trabalho trabalho) {
	        if (quantidadeTrabalhos < 100) {
	            trabalhos[quantidadeTrabalhos] = trabalho;
	            quantidadeTrabalhos++;
	            JOptionPane.showMessageDialog(null, "Trabalho adicionado com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "A lista de trabalhos est� cheia!");
	        }
	    }

	    public void listarContatos() {
	        String lista = "Lista de Contatos:\n";
	        for (int i = 0; i < quantidadeContatos; i++) {
	            lista += contatos[i].getNome() + " - " + contatos[i].getTelefone() + "\n";
	        }
	        JOptionPane.showMessageDialog(null, lista);
	    }

	    public void listarAniversarios() {
	        String lista = "Lista de Anivers�rios:\n";
	        for (int i = 0; i < quantidadeAniversarios; i++) {
	            lista += aniversarios[i].getNome() + " - " + aniversarios[i].getData() + "\n";
	        }
	        JOptionPane.showMessageDialog(null, lista);
	    }

	    public void listarProvas() {
	        String lista = "Lista de Provas:\n";
	        for (int i = 0; i < quantidadeProvas; i++) {
	            lista += provas[i].getMateria() + " - " + provas[i].getData() + "\n";
	        }
	        JOptionPane.showMessageDialog(null, lista);
	    }

	    public void listarTrabalhos() {
	        String lista = "Lista de Trabalhos:\n";
	        for (int i = 0; i < quantidadeTrabalhos; i++) {
	            lista += trabalhos[i].getProjeto() + " - " + trabalhos[i].getPrazo() + "\n";
	        }
	        JOptionPane.showMessageDialog(null, lista);
	    }

	    public void excluirEvento(int tipo, int indice) {
	        switch (tipo) {
	            case 1:
	                if (indice >= 0 && indice < quantidadeAniversarios) {
	                    for (int i = indice; i < quantidadeAniversarios - 1; i++) {
	                        aniversarios[i] = aniversarios[i + 1];
	                    }
	                    quantidadeAniversarios--;
	                    JOptionPane.showMessageDialog(null, "Anivers�rio exclu�do com sucesso!");
	                } else {
	                    JOptionPane.showMessageDialog(null, "�ndice inv�lido!");
	                }
	                break;
	            case 2:
	                if (indice >= 0 && indice < quantidadeProvas) {
	                    for (int i = indice; i < quantidadeProvas - 1; i++) {
	                        provas[i] = provas[i + 1];
	                    }
	                    quantidadeProvas--;
	                    JOptionPane.showMessageDialog(null, "Prova exclu�da com sucesso!");
	                } else {
	                    JOptionPane.showMessageDialog(null, "�ndice inv�lido!");
	                }
	                break;
	            case 3:
	                if (indice >= 0 && indice < quantidadeTrabalhos) {
	                    for (int i = indice; i < quantidadeTrabalhos - 1; i++) {
	                        trabalhos[i] = trabalhos[i + 1];
	                    }
	                    quantidadeTrabalhos--;
	                    JOptionPane.showMessageDialog(null, "Trabalho exclu�do com sucesso!");
	                } else {
	                    JOptionPane.showMessageDialog(null, "�ndice inv�lido!");
	                }
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Tipo de evento inv�lido!");
	                break;
	        }
	    }
	}