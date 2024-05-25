package com.tanmoy037.HRM.Software.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization {

    @Id
    private Long id;

    @Column(name = "organization")
    private String name;

    private Long total_employee;
}
