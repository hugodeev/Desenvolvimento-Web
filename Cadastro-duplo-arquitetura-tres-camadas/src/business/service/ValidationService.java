
package business.service;

public class ValidationService {

    public static boolean isValidId(int id) {
        return id > 0;
    }

    public static boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static boolean isValidCargaHoraria(int carga) {
        return carga > 0 && carga <= 240;
    }

    public static boolean isValidMatricula(String matricula) {
        return matricula != null && !matricula.trim().isEmpty();
    }

    public boolean validateName(String name) {
        if (!isValidString(name)) {
            System.out.println("Nome inválido!");
            return false;
        }
        return true;
    }

    public boolean validateMat(String mat) {
        if (!isValidMatricula(mat)) {
            System.out.println("Matrícula inválida!");
            return false;
        }
        return true;
    }

    public boolean validateCurso(String curso) {
        if (!isValidString(curso)) {
            System.out.println("Curso inválido!");
            return false;
        }
        return true;
    }

    public boolean validateSubjectName(String name) {
        if (!isValidString(name)) {
            System.out.println("Nome da disciplina inválido!");
            return false;
        }
        return true;
    }

    public boolean validateSubjectId(int id) {
        if (!isValidId(id)) {
            System.out.println("ID da disciplina inválido!");
            return false;
        }
        return true;
    }

    public boolean validateCargaHoraria(int carga) {
        if (!isValidCargaHoraria(carga)) {
            System.out.println("Carga horária inválida!");
            return false;
        }
        return true;
    }

    public boolean validateProfessor(String professor) {
        if (!isValidString(professor)) {
            System.out.println("Nome do professor inválido!");
            return false;
        }
        return true;
    }

    


}