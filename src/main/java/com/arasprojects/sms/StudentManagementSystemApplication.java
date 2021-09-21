package com.arasprojects.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arasprojects.sms.entity.Student;
import com.arasprojects.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	Student student1 = new Student("Shanmu", "priya", "shanpariaras@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Shanmuga", "priyarun", "shan@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("arun ", "pandi", "arun@gmail.com");
		studentRepository.save(student3);5
		*/
		
	}

}
