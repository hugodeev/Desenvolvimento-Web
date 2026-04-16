
public class Disciplina {
    private int id;
    private String nome;
    private int cargaHoraria;
    private String professor;

    // Construtor
    public Disciplina(int id, String nome, int cargaHoraria, String professor) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    // Método para exibir os dados
    public void mostrar() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Carga: " + cargaHoraria + "h | Professor: " + professor);
    }
}