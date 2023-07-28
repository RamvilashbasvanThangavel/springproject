package com.example4.BasicPrep.Ba01Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example4.BasicPrep.Ba02Primary.Emp;

import jakarta.websocket.server.PathParam;

@RestController
public class EmpController {
	@Autowired
	@Qualifier("Senior")
	// qualifier used to give the response of which message need to get excextue
	Emp emp;

	@GetMapping(value = "/getdetails")
	public String hello() {
		return emp.getMsg();
	}

	@Value("${checking.thisvalue}")
	private String a;

	@GetMapping(value = "/getValuesfromApplicationProperties")
	public String getValue() {
		return "Hello " + a;
	}

	@GetMapping(value = "/exForPathParam")
	public String getDetails(@PathParam("usr") String usr) {
		if (usr.equals("Ramvilash")) {
			return "Login Success";
		} else {
			return "Login Failed";
		}
	}

	@GetMapping(value = "/exForRequestParam")
	public String check(@RequestParam("Usr") String usr, @RequestParam("Pass") String pass) {
		if (usr.equals("Ramvilash") && pass.equals("Ram1804")) {
			return "Login Success";
		} else {
			return "Login Failed";
		}
	}

}
