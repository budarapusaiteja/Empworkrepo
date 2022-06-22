package com.sample.sampledata;

import java.util.List;
import com.sample.sampledata.exe.custexception2;

public interface Services {
	public List<EmployeeTable> getAllRecords();
	public EmployeeTable gitid(Integer j);
	public void setdetails(EmployeeTable e);
	public void saverecord(EmployeeTable e)throws custexception2;
}
