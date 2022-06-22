package com.sample.sampledata;
import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.sample.sampledata.exe.*;

@ControllerAdvice
public class custException extends ResponseEntityExceptionHandler{
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> notfound(NoSuchElementException e) {
		return new ResponseEntity<String>("input ID not found in database, Please enter correct input data",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(custexception2.class)
	public ResponseEntity<String> foundrecord(custexception2 e) {
		return new ResponseEntity<String>("cannot add duplicate values",HttpStatus.NOT_FOUND);
	}
	
}
