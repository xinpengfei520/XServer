package serviceimpl;

import java.util.List;

import bean.Student;
import business.StudentBusiness;
import service.StudentService;

/**
 * @date 2018年5月12日
 * @author Vancy
 * Function:
 */
public class StudentServiceImpl implements StudentService{

	/* (non-Javadoc)
	 * @see service.StudentService#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentBusiness.getAllStudents();
	}

}
