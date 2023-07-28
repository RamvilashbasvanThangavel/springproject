package com.example4.BasicPrep.Ba01Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WithControllerandResponseBody {

	@GetMapping("/getThisResponse")
	public String getThis() {
		return "hello.html";
		// read the given value in return format of getMapping value.
	}

}
