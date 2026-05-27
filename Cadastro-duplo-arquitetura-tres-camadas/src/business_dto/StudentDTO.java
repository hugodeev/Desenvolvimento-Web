// DTO: explicar
package business_dto;

public class StudentDTO {
    
    private String name, mat, curso;

    public StudentDTO(String name, String mat, String curso) {
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

    public String toString() {
        return "Student: name: " + name + ", mat: " + mat + ", curso: " + curso;
    }

}
