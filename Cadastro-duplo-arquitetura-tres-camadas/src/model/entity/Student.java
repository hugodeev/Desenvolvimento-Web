package model.entity;

public class Student {
    private String name;
    private String mat;
    private String curso;

    public Student(String name, String mat, String curso) {
        super();
        this.name = name;
        this.mat = mat;
        this.curso = curso;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMat() { return mat; }
    public void setMat(String mat) { this.mat = mat; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return "Student: Nome:" + name + ", Matrícula:" + mat + ", Curso:" + curso;
    }
}