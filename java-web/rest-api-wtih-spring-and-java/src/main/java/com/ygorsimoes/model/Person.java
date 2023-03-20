package com.ygorsimoes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "firt_name",
            nullable = false,
            length = 80)
    private String firtName;

    @Column(
            name = "last_name",
            nullable = false,
            length = 80)
    private String lastName;

    @Column(
            nullable = false,
            length = 100)
    private String address;

    @Column(
            nullable = false,
            length = 6)
    private String gender;
}
