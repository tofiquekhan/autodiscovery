package myproject.autodiscovery.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import myproject.autodiscovery.dto.Student;
import myproject.autodiscovery.service.StudentService;

@Controller("studentController")
public class StudentControllerImpl implements StudentController{

	BufferedReader br = null;
	
	@Autowired
	private StudentService studentService;
	
	public StudentControllerImpl() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addStudent() {

		try {
			System.out.print("Student Id		: " );
			String sid = br.readLine();
			System.out.print("Student Name 		: ");
			String sname = br.readLine();
			System.out.print("Student Address	: ");
			String saddr = br.readLine();
			Student student = new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);
			String status = studentService.addStudent(student);
			if(status.equals("existed")) {
				System.out.println("Student Existed Already");
			}
			if(status.equals("success")) {
				System.out.println("Student Insertion Success");
			}
			if(status.equals("failure")) {
				System.out.println("Student Insertion Failure");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void searchStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
