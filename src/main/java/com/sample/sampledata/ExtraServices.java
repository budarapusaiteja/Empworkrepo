package com.sample.sampledata;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sample.sampledata.exe.*;

@Component
public class ExtraServices implements Services{
	@Autowired
	myInterface i;
	public List<EmployeeTable> getAllRecords(){
		return i.findAll();
	}
	@Override
	public EmployeeTable gitid(Integer j) {
		return i.findById(j).get();
	}
	public void setdetails(EmployeeTable e) {
		if(i.findById(e.getId())!=null) {
		EmployeeTable et=i.findById(e.getId()).get();
		et.setId(e.getId());
		et.setName(e.getName());
		et.setSalary(e.getSalary());
		i.save(et);
		}
		//return i.findById(et.getId()).get();
	}
	//boolean b=false;
	public void saverecord(EmployeeTable e) throws custexception2{
		if(i.findById(e.getId())!=null) {
			throw new custexception2("id already present, cannot add duplicate values");
		}
		if(i.findById(e.getId())==null) {
			i.save(e);
			//b=true;
		}
		//return b;
	} 
}
