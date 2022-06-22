package com.sample.sampledata.exe;

import org.springframework.stereotype.Component;

@Component
public class custexception2 extends Exception {
	private static final long serialVersionUID=1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String errcode;
	private String errmess;
	public custexception2() {
		
	}
	public custexception2(String errcode, String errmess) {
		super();
		this.errcode = errcode;
		this.errmess = errmess;
	}

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmess() {
		return errmess;
	}

	public void setErrmess(String errmess) {
		this.errmess = errmess;
	}

	public custexception2(String m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

}
