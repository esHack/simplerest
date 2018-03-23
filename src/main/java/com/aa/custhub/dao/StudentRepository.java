package com.aa.custhub.dao;

import com.aa.custhub.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yaga created on 3/22/2018.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findById(long id);
}
