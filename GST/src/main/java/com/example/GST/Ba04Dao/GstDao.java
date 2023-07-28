package com.example.GST.Ba04Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.GST.Ba01Entity.Gst;
import com.example.GST.Ba05Repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepo;

	public String addList(List<Gst> g) {
		gstRepo.saveAll(g);
		return "List Saved Successfully";
	}

	public int getByHsn(int hsn) {
		return gstRepo.getByHsn(hsn);
	}
}
