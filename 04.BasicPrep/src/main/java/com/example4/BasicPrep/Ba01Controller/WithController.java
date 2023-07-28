package com.example4.BasicPrep.Ba01Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WithController {
	@GetMapping("/getThis")
	public String getThis() {
		return "hello.html";
		// read the file Data in hello.html which is created in src/main/resources in
		// staic folder
	}

}
