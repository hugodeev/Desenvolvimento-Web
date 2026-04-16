
public class Estudante {
    private int id;
    private String nome;
    private String matricula;
    private String curso;

    // Construtor
    public Estudante(int id, String nome, String matricula, String curso) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método para exibir os dados
    public void mostrar() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Matrícula: " + matricula + " | Curso: " + curso);
    }
}