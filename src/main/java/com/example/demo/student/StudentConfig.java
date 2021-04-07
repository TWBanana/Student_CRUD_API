package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

/**
 * Created by Kevin on 4/6/21
 */
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student marian = new Student(
                    "Marian",
                    "marian.jamal@email.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student john = new Student(
                    "John",
                    "john@email.com",
                    LocalDate.of(2004, JANUARY, 5)
            );

            studentRepository.saveAll(List.of(marian, john));
        };
    }
}
