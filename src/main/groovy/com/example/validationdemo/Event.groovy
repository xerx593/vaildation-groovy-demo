package com.example.validationdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "event")
class Event extends Base {

    @Column(nullable = false, unique = true)
    @NotBlank
    String name
}