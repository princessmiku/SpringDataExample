package de.miku.springdatatest;

import org.springframework.stereotype.Service;

@Service
public class StudentImpl{

    private final StudentRepository repository;

    public StudentImpl(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentRepository getRepository() {
        return repository;
    }
}
