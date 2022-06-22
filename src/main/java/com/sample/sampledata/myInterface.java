package com.sample.sampledata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface myInterface extends JpaRepository<EmployeeTable,Integer>{
	
}
