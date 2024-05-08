package org.example.dockerdemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    String description;
}
