package com.aa.custhub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author yaga created on 3/22/2018.
 */
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private String passportNumber;
    public Student() {
        super();
    }
    public Student(Long id, String name, String passportNumber) {
        super();
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
    }
    public Student(String name, String passportNumber) {
        super();
        this.name = name;
        this.passportNumber = passportNumber;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
    }

}
