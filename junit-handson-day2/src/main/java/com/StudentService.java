/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vijayalakshmi
 *
 */
@RestController
@RequestMapping("/students")
public class StudentService {
	

	List<Student> lstStudents = new ArrayList<Student>();

	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Student> getStudents() {
		if (lstStudents.isEmpty()) {
			lstStudents.add(new Student(1, "ABC"));
			lstStudents.add(new Student(2, "DEF"));
		}		
		return lstStudents;
	}

	@GetMapping("/getById/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Student> getStudentById(@PathVariable int id) {
		return getStudents().stream().filter(s -> s.getId() == id).findFirst();
	}

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addStudent(@RequestBody Student student) {
		lstStudents.add(student);
		return "added successfully";
	}

	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public String updateStudent(@RequestBody Student student) {
		getStudents().stream().filter(s -> s.getId() == student.getId())
				.findFirst().get().setName(student.getName());
		return "updated successfully";
	}

	@DeleteMapping("/deletebyId/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String deleteStudentById(@PathVariable int id) {
		lstStudents.remove(getStudents().stream().filter(s -> s.getId() == id)
				.findAny().get());
		return "deleted successfully";
	}

	@DeleteMapping("/deleteAll")
	@ResponseStatus(HttpStatus.OK)
	public String deleteAll() {
		lstStudents.clear();
		return "deleted successfully";
	}

}
