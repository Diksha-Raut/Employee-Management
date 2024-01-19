package com.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
