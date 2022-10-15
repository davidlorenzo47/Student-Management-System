package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Using this block of code, we can add students in the database.
//		Student student1 = new Student("abc", "xyz", "abcxyz@email.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("def", "xyz", "def@gmail.com");
//		studentRepository.save(student2);
	}
}
