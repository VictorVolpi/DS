
class Prova extends Agenda {
    private String materia;
    private String data;

    public Prova(String materia, String data) {
        this.materia = materia;
        this.data = data;
    }

    public String getMateria() {
        return materia;
    }

    public String getData() {
        return data;
    }
}
