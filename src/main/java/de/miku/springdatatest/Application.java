package de.miku.springdatatest;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
@Transactional
public class Application implements CommandLineRunner{

    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public Application(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) {
        String student = studentRepository.getById(1L).getEmail();
        System.out.println(student);
    }


}
