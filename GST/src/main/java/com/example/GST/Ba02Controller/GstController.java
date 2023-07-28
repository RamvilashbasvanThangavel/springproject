package com.example.GST.Ba02Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GST.Ba01Entity.Gst;
import com.example.GST.Ba03Service.GstService;

@RestController
@RequestMapping(value = "/GST")
public class GstController {
	@Autowired
	GstService gstSer;

	@PostMapping(value = "/AddListGST")
	public String addList(@RequestBody List<Gst> g) {
		return gstSer.addList(g);
	}

	@GetMapping(value = "/getByHsnNum/{hsn}")
	public int getByHsn(@PathVariable int hsn) {
		return gstSer.getByHsn(hsn);
	}
}
