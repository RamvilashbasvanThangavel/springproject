package com.example.StudentMarkSheet.ba02Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMarkSheet.ba01Entity.MarkSheet;
import com.example.StudentMarkSheet.ba03Service.MarkSheetService;

@RestController
@RequestMapping(value = "/StudentMarkSheet")
public class MarkSheetController {
	@Autowired
	MarkSheetService markSer;

	@PostMapping(value = "/postingMarkSheetList")
	public String addList(@RequestBody List<MarkSheet> mark) {
		for (MarkSheet ms : mark) {
			int temp1 = (ms.getSem1Practicals() + ms.getSem1Theory());
			int temp2 = (ms.getSem2Practicals() + ms.getSem2Theory());
			ms.setSem1Total(temp1);
			ms.setSem2Total(temp2);
		}
		markSer.addList(mark);
		return "List Saved SuccessFully";
	}// http://localhost:8081/StudentMarkSheet/postingMarkSheetList

	@GetMapping(value = "/getAllDetails")
	public List<MarkSheet> getdetails() {
		return markSer.getdetails();
	}// http://localhost:8081/StudentMarkSheet/getAllDetails

	@GetMapping(value = "/getTotalMarksbyUsingRollNumber/{rollnumber}")
	public int getTotalByRollNo(@PathVariable int rollnumber) {
		return markSer.getTotalByRollNo(rollnumber);
	}
}
