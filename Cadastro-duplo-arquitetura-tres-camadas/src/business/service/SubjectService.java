package business.service;

import java.util.ArrayList;
import java.util.List;
import business_dto.SubjectDTO;
import model.entity.Subject;
import model.repository.SubjectRepository;


public class SubjectService {
    private SubjectRepository subjectRepository = new SubjectRepository();

    public void create(int id, String disciplina, int cargaHoraria, String professor) {  
        Subject subject = new Subject(id, disciplina, cargaHoraria, professor);

        subjectRepository.save(subject);
    }

    public List<SubjectDTO> findAll() {
        List<Subject> subjects = subjectRepository.findAll();
        List<SubjectDTO> subjectDTO = new ArrayList<SubjectDTO>();
        for (Subject subject : subjects) {
            subjectDTO.add(new SubjectDTO(subject.getId(), subject.getName(), subject.getCargaHoraria(), subject.getProfessor()));
        }
        return subjectDTO;
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