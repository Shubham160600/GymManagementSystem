package shub.Service;

import java.util.List;
import shub.Model.Class;

public interface ClassService {
    void addClass(Class Class);
    void updateClass(Class Class);
    void deleteClass(int classId);
    Class getClassById(int classId);
    List<Class> getAllClass();
    void exitClass(int classId);
}

