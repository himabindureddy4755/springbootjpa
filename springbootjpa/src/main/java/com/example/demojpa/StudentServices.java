package com.example.demojpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentServices {
	@Autowired
	StudentRepository studentRepository;
	List<Student> students = new ArrayList<>();
	public void createStudents() {
		students.add(new Student(1, "himabindu", 1, 11));
		students.add(new Student(4, "bindu", 2, 22));
		students.add(new Student(3, "hima",3, 33));
		students.add(new Student(2, "himani", 4, 44));
	}
	public List<Student> getStudents(){
		//createStudents();
		//return students;
		List<Student> students = new ArrayList<>();
		
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	/*public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student student=  students.stream().filter(s -> s.getId() == id ).findFirst().get();
		return student;
	}*/
	/*public void addStudent(Student student) {
		System.out.println("controllers add student");
		students.add(student);
	}*/
	/*public void updateStudent(Student student, int id) {
		for(int i = 0; i< students.size(); i++) {
			Student s = students.get(0);
			if(s.getId() == id) {
				students.set(id, student);
				return;
			}
		}
	}*/
	/*public void removeStudent(int id) {
		
		// TODO Auto-generated method stub
		students.removeIf(s -> s.getId() == id);
		
	}*/
	public void  addStudent(Student student)
	{
		studentRepository.save(student);
	}
	
		
	}

