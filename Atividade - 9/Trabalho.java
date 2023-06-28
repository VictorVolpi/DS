
class Trabalho extends Agenda{
    private String projeto;
    private String prazo;

    public Trabalho(String projeto, String prazo) {
        this.projeto = projeto;
        this.prazo = prazo;
    }

    public String getProjeto() {
        return projeto;
    }

    public String getPrazo() {
        return prazo;
    }
}
