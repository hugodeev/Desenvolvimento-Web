package business.service;

import java.util.List;
import model.entity.Subject;
import model.repository.SubjectRepository;

public class SubjectService {
    private SubjectRepository subjectRepository = new SubjectRepository();

    public void create(int id, String disciplina, int cargaHoraria, String professor) {  
        Subject subject = new Subject(id, disciplina, cargaHoraria, professor);

        subjectRepository.save(subject);
    }

    public List<Subject> findAll() {
       return subjectRepository.findAll();
    }

    public boolean update(String oldId, String newName, String newId, int newCargaHoraria, String newProfessor) {
        Subject subject = subjectRepository.findById(oldId);
        if (subject != null) {
            subject.setName(newName);
            subject.setId(Integer.parseInt(newId));
            subject.setCargaHoraria(newCargaHoraria);
            subject.setProfessor(newProfessor);
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        Subject subject = subjectRepository.findById(id);
        if (subject != null) {
            return subjectRepository.delete(subject);
        }
        return false;
    }
}