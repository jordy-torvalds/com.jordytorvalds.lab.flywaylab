package com.jordytorvalds.lab.domain;

import javax.persistence.*;

@Entity
@Table
public class Table1 {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

}
