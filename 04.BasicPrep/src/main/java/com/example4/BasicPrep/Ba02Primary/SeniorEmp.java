package com.example4.BasicPrep.Ba02Primary;

import org.springframework.stereotype.Service;

@Service("Senior")
public class SeniorEmp implements Emp {

	public String getMsg() {
		return "Hi This id Senior Emp";
	}

}
