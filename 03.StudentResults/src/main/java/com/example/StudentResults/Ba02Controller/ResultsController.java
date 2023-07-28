package com.example.StudentResults.Ba02Controller;

import java.util.List;

import javax.management.relation.RelationService;
import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.StudentResults.Ba01Entity.MarkSheet;
import com.example.StudentResults.Ba01Entity.Results;
import com.example.StudentResults.Ba03Service.ResultsService;

@RestController
@RequestMapping(value = "/Results")
public class ResultsController {
	@Autowired
	ResultsService resSer;

	@Autowired
	RestTemplate rT;

	@PostMapping(value = "/AddList")
	public String addList(@RequestBody List<Results> r) {
		return resSer.addList(r);
	}

	@PostMapping(value = "/getMarkswithRollNumber")
	public String getList(@RequestBody List<Results> r) {
		String url1 = "http://localhost:8081/StudentMarkSheet/getTotalMarksbyUsingRollNumber/";
		for (Results re : r) {
			int rollNo = re.getRollnumber();
			ResponseEntity<Integer> response1 = rT.exchange(url1 + rollNo, HttpMethod.GET, null, Integer.class);
			int total = response1.getBody();
			re.setTotalMarks(total);
		}
		resSer.getList(r);
		return "Total Save SuccessFully";
	}

	@PostMapping(value = "/addingExtraMarks")
	public String additionalMarks(@RequestBody List<Results> r) {
		String url1 = "http://localhost:8080/Student/gettingAllList";
		String url2 = "http://localhost:8081/StudentMarkSheet/getTotalMarksbyUsingRollNumber/";
		
		ResponseEntity<List<Results>> response1 = rT.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Results>>() {
				});
		List<Results> res = response1.getBody();
		for (Results re : res) {
			int rollNo = re.getRollnumber();
			ResponseEntity<List<Results>> response2 = rT.exchange(url2 + rollNo, HttpMethod.GET, null, new ParameterizedTypeReference<List<Results>>() {
			});
			List<Results> att = response2.getBody();
			for(Results re1 : att) {
				re1.setName(re.getName());
				re1.setAttendance(re.)
			}
			if (att <= 90 && re.getTotalMarks() < 395) {
				re.setTotalMarks(re.getTotalMarks());
			} else {
				re.setTotalMarks(re.getTotalMarks() + 5);
			}
		}
		resSer.additionalMarks(r);
		return "Addtional Marks Added SuccessFully";
	}
	
	@PostMapping(value="/addPercentageforResults")
	public 

}
