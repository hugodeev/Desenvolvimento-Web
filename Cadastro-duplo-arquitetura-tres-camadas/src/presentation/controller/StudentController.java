package presentation.controller;

import java.util.List;
import business.service.PrinterService;
import business.service.StudentService;
import business.service.ValidationService;
import business_dto.StudentDTO;
// import model.entity.StudentDTO; -- DTO: explicar

public class StudentController {

    private ValidationService validationService = new ValidationService();
    private StudentService studentService = new StudentService(); 
    private PrinterService printerService = new PrinterService();

    // Criar 
    public void create(String name, String mat, String curso) {
        if (validationService.validateName(name) && validationService.validateMat(mat) && validationService.validateCurso(curso)) {
            studentService.create(name, mat, curso);
        }
    }

    //Listar
    public void showAll() { // DTO: explicar
        List<StudentDTO> students = studentService.findAll();

        printerService.println("Lista de estudantes: ");
        for (StudentDTO student : students) {
            printerService.println(student.toString());
        }
    }

    // Atualizar
    public boolean update(String oldMat, String newName, String newMat, String newCurso) {
        if (validationService.validateName(newName) && validationService.validateMat(newMat) && validationService.validateCurso(newCurso)) {
            return studentService.update(oldMat, newName, newMat, newCurso);
        }
        return false;
    }

    // Deletar
    public boolean delete(String mat) {
        if (mat != null){
            return studentService.delete(mat);
        }
        return false;
    }
   
}