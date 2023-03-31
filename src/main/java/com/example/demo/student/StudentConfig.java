package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jimmy = new Student(
                    "Jimmy",
                    LocalDate.of(1979, Month.SEPTEMBER, 24),
                    "jim@test.com"
            );

            Student hester = new Student(
                    "Hester",
                    LocalDate.of(1980, Month.FEBRUARY,03 ),
                    "hester@test.com"
            );

            repository.saveAll(
                    List.of(jimmy, hester)
            );
        };
    }
}
