package model.repository;
import java.util.ArrayList;
import java.util.List;
import model.entity.Subject;

public class SubjectRepository {

    private List<Subject> subjects = new ArrayList<Subject>();

    public void save(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> findAll() {
        return subjects;
    }

    public Subject findById(String id) {
        for (Subject subject : subjects) {
            if (subject.getId() == Integer.parseInt(id)) {
                return subject;
            }
        }
        return null;
    }

    public boolean delete(Subject subject) {
        return subjects.remove(subject);
    }

}