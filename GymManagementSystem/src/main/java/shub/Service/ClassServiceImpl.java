package shub.Service;

import java.util.List;

import shub.DAO.ClassDAO;
import shub.Model.Class;

public class ClassServiceImpl implements ClassService {
    private ClassDAO classDAO;

    public ClassServiceImpl(ClassDAO classDAO) {
        this.classDAO = classDAO;
    }

//    @Override
    public void addClass(Class Class) {
        classDAO.addClass(Class);
    }

//    @Override
    public void updateClass(Class Class) {
        classDAO.updateClass(Class);
    }

    @Override
    public void deleteClass(int classId) {
        classDAO.deleteClass(classId);
    }
    
    @Override
    public void exitClass(int classId) {
        classDAO.exitClass(classId);
    }

    @Override
    public Class getClassById(int classId) {
        return classDAO.getClassById(classId);
    }

    @Override
    public List<Class> getAllClass() {
        return classDAO.getAllClasses();
    }
}

//	@Override
//	public void addClass(shub.Model.Class Class) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void updateClass(shub.Model.Class Class) {
//		// TODO Auto-generated method stub
//		
//	}
//}

