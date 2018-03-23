package com.aa.custhub.controller;

import com.aa.custhub.dao.StudentRepository;
import com.aa.custhub.exception.ResourceNotFoundException;
import com.aa.custhub.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaga created on 3/22/2018.
 */
@RestController
public class H2Controller {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/getH2data/student/{id}", method = RequestMethod.GET)
        public ResponseEntity<Student> getData(@PathVariable("id") int id) {
        System.out.println("gettt"+id);
        Student student = studentRepository.findById(id);

        if (student == null) {
            System.out.println("Student with id " + id + " not found");
            //return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
            throw new ResourceNotFoundException(new Long(id), "student not found");
        }
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

}
