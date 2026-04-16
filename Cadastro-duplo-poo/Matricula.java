

public class Matricula {
    private Estudante estudante;
    private Disciplina disciplina;

    // Construtor
    public Matricula(Estudante estudante, Disciplina disciplina) {
        this.estudante = estudante;
        this.disciplina = disciplina;
    }

    // Getters
    public Estudante getEstudante() {
        return estudante;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    // Setters
    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // Método para exibir os dados
    public void mostrar() {
        System.out.println("Estudante: " + estudante.getNome() + " -> Disciplina: " + disciplina.getNome());
    }
}