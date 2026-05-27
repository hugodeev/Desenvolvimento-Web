package business.service;
import java.util.ArrayList;
import java.util.List;
import business_dto.StudentDTO;
import model.entity.Student;
import model.repository.StudentRepository;

public class StudentService {
    private StudentRepository studentRepository = new StudentRepository();

    public void create(String name, String mat, String curso) {  
        Student student = new Student(name, mat, curso);

        studentRepository.save(student);
    }

    public List<StudentDTO> findAll() { // DTO: explicar
       List<Student> students = studentRepository.findAll();
       List<StudentDTO> studentDTO = new ArrayList<StudentDTO>();

       for (Student student : students) {
           studentDTO.add(new StudentDTO(student.getName(), student.getMat(), student.getCurso()));
       }

       return studentDTO;
    }

    public boolean update(String oldMat, String newName, String newMat, String newCurso) {
        Student student = studentRepository.findByRegister(oldMat);
        if (student != null) {
            student.setName(newName);
            student.setMat(newMat);
            student.setCurso(newCurso);
            return true;
        }
        return false;
    }

    public boolean delete(String mat) {
        Student student = studentRepository.findByRegister(mat);
        if (student != null) {
            return studentRepository.delete(student);
        }
        return false;
    }
}


    

