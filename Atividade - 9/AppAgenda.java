import javax.swing.JOptionPane;
public class AppAgenda{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        int opcao = 0;
        while (opcao != 5) {
            String input = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n1 - Adicionar Contato\n2 - Adicionar Aniversário\n3 - Adicionar Prova\n4 - Adicionar Trabalho\n5 - Listar Contatos\n6 - Listar Aniversários\n7 - Listar Provas\n8 - Listar Trabalhos\n9 - Excluir Evento\n10 - Sair");
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                    String nomeContato = JOptionPane.showInputDialog("Digite o nome do contato:");
                    String telefoneContato = JOptionPane.showInputDialog("Digite o telefone do contato:");
                    Contato contato = new Contato(nomeContato, telefoneContato);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    String nomeAniversario = JOptionPane.showInputDialog("Digite o nome do aniversariante:");
                    String dataAniversario = JOptionPane.showInputDialog("Digite a data do aniversário:");
                    Aniversario aniversario = new Aniversario(nomeAniversario, dataAniversario);
                    agenda.adicionarAniversario(aniversario);
                    break;
                case 3:
                    String materiaProva = JOptionPane.showInputDialog("Digite a matéria da prova:");
                    String dataProva = JOptionPane.showInputDialog("Digite a data da prova:");
                    Prova prova = new Prova(materiaProva, dataProva);
                    agenda.adicionarProva(prova);
                    break;
                case 4:
                    String projetoTrabalho = JOptionPane.showInputDialog("Digite o nome do projeto:");
                    String prazoTrabalho = JOptionPane.showInputDialog("Digite o prazo do trabalho:");
                    Trabalho trabalho = new Trabalho(projetoTrabalho, prazoTrabalho);
                    agenda.adicionarTrabalho(trabalho);
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 6:
                    agenda.listarAniversarios();
                    break;
                case 7:
                    agenda.listarProvas();
                    break;
                case 8:
                    agenda.listarTrabalhos();
                    break;
                case 9:
                    String tipoEvento = JOptionPane.showInputDialog(
                            "Escolha o tipo de evento para excluir:\n1 - Aniversário\n2 - Prova\n3 - Trabalho");
                    int tipo = Integer.parseInt(tipoEvento);
                    String indiceEvento = JOptionPane.showInputDialog("Digite o índice do evento:");
                    int indice = Integer.parseInt(indiceEvento);
                    agenda.excluirEvento(tipo, indice);
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}