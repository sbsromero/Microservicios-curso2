package com.mongodb.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.api.model.Student;
import com.mongodb.api.repository.StudentRepository;

@Service
public class StudentServiceV1Impl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> findById(String id) {
		return studentRepository.findById(id);
	}

	@Override
	public void removeStudent(String id) {
		Student st = new Student();
		st.setId(id);
		studentRepository.delete(st);
	}

}
