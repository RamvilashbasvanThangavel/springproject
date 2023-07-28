package com.example4.BasicPrep.Ba02Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("Junior")
public class JuniorEmp implements Emp {
	
	public String getMsg() {
		return "Hi This is junior";
	}

}
