package com.Conection.SpringSQLliteConexio.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class User {

    @Id
    private Long Id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private Integer age;

    private String email;



}
