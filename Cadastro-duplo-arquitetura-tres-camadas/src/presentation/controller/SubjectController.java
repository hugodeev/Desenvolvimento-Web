package presentation.controller;

import java.util.List;
import business.service.PrinterService;
import business.service.SubjectService;
import business.service.ValidationService;
import model.entity.Subject;

public class SubjectController {

    private SubjectService subjectService = new SubjectService();
    private ValidationService validationService = new ValidationService();
    private PrinterService printerService = new PrinterService();

    // Criar
    public void create(int id, String disciplina, int cargaHoraria, String professor) {
        if (validationService.validateSubjectId(id) && validationService.validateSubjectName(disciplina) && validationService.validateCargaHoraria(cargaHoraria) && validationService.validateProfessor(professor)) {
            subjectService.create(id, disciplina, cargaHoraria, professor);
        }
    }

    // Listar
    public void showAll() {
        List<Subject> subjects = subjectService.findAll();
        printerService.println("Lista de disciplinas: ");
        for (Subject subject : subjects) {
            printerService.println(subject.toString());
        }
    }

    // Atualizar
    public boolean update(String oldId, String newName, String newId, int newCargaHoraria, String newProfessor) {
        if (validationService.validateSubjectName(newName) && validationService.validateSubjectId(Integer.parseInt(newId)) && validationService.validateCargaHoraria(newCargaHoraria) && validationService.validateProfessor(newProfessor)) {
            return subjectService.update(oldId, newName, newId, newCargaHoraria, newProfessor);
        }
        return false;
    }

    // Deletar
    public boolean delete(String id) {
        if (id != null){
            return subjectService.delete(id);
        }
        return false;
    }





}