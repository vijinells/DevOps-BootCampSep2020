/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Vijayalakshmi
 *
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestStudentService {


StudentService studentService=new StudentService();
	List<Student> lstStudents=new ArrayList<Student>();
	
	@BeforeEach
	public void setup() {
		if (lstStudents.isEmpty()) {
			lstStudents.add(new Student(1, "ABC"));
			lstStudents.add(new Student(2, "DEF"));
		}
	}

	@Test	
	public void getStudents() {
		System.out.println(studentService.getStudents());
		Assertions.assertEquals(lstStudents.size(), studentService.getStudents().size());
	}
	
	@Test	
	public void getStudentById() {
		Assertions.assertEquals(lstStudents.stream().filter(s -> s.getId() == 1)
				.findFirst().get().getName(), studentService.getStudentById(1).get().getName());
	}
	
	@Test	
	public void addStudent() {
		Student student=new Student(3,"GHI");
		lstStudents.add(student);
		Assertions.assertEquals("added successfully",studentService.addStudent(student));
	}
	
	@Test	
	public void updateStudent() {
		Student student=new Student(2,"JKL");
		Assertions.assertEquals("updated successfully",studentService.updateStudent(student));
	}
	
	@Test	
	public void deleteStudent() {		
		Assertions.assertEquals("deleted successfully",studentService.deleteStudentById(2));
	}
	
	@Test	
	public void deleteStudents() {		
		Assertions.assertEquals("deleted successfully",studentService.deleteAll());
	}
}

