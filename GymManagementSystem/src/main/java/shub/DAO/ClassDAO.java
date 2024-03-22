package shub.DAO;

import java.util.List;
import shub.Model.Class;

public interface ClassDAO {
    void addClass(Class gymClass);

    void updateClass(Class gymClass);

    void deleteClass(int classId);

    void exitClass(int classId);

    Class getClassById(int classId);

    List<Class> getAllClasses();

    List<Class> getAllClass();
}
