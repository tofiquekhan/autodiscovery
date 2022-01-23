package myproject.autodiscovery.service;

import myproject.autodiscovery.dto.Student;

public interface StudentService {

	public String addStudent(Student student);
	public Student searchStudent(String sid);
	public Student getStudent(String sid);
	public String updateStudent(Student student);
	public String deleteStudent(String sid);
	
}
