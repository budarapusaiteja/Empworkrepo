package com.sample.sampledata;
import com.sample.sampledata.exe.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	ExtraServices e;
	
	@GetMapping(value="/getby/{id}")
	public ResponseEntity<EmployeeTable> getbyid(@PathVariable Integer id) {
		//if(i.findById(id)!=null) 
		EmployeeTable i=e.gitid(id);
		//return i.findById(id);
		return new ResponseEntity<EmployeeTable>(i,HttpStatus.OK);
	}
	@GetMapping(value="/getAll")
	public ResponseEntity<List<EmployeeTable>> get() {
		//return i.findAll();
		List<EmployeeTable> l=e.getAllRecords();
		return new ResponseEntity<List<EmployeeTable>>(l,HttpStatus.OK);
	}
	@PostMapping(value="/edit")
	public ResponseEntity<String> editrecord(@RequestBody EmployeeTable r) {
		e.setdetails(r);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	@PostMapping(value="/add")
	public ResponseEntity<String> addnew(@RequestBody EmployeeTable r) throws custexception2 {
		e.saverecord(r);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
}
