package com.example.GST.Ba03Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GST.Ba01Entity.Gst;
import com.example.GST.Ba04Dao.GstDao;

@Service
public class GstService {
	@Autowired
	GstDao gstDao;

	public String addList(List<Gst> g) {
		return gstDao.addList(g);
	}

	public int getByHsn(int hsn) {
		return gstDao.getByHsn(hsn);
	}

}
