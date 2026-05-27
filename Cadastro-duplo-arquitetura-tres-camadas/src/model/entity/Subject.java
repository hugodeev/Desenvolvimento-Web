package model.entity;

public class Subject {
    private int id, cargaHoraria;
    private String name, professor;

    public Subject(int id, String name, int cargaHoraria, String professor) {
        this.id = id;
        this.name = name;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }

    @Override
    public String toString() {
        return "Subject: id: " + id + ", Nome:" + name + ", Carga Horaria: " + cargaHoraria + ", Professor: " + professor;
    }
}