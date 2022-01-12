package com.example.validationdemo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
class Base {
    @Id
    @GeneratedValue
    Long id;
}
