package com.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.api.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
