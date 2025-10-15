package com.example.school_database.models;

import lombok.*;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

/*    @Column(name = "email", nullable = false, unique = true)
    private String email;*/

}
