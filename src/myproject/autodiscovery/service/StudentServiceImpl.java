package myproject.autodiscovery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.autodiscovery.dao.StudentDao;
import myproject.autodiscovery.dto.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public String addStudent(Student student) {
		return studentDao.add(student);
	}

	@Override
	public Student searchStudent(String sid) {
		return studentDao.search(sid);
	}

	@Override
	public Student getStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
