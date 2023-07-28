package com.example.GST.Ba05Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GST.Ba01Entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {

	@Query(value = "Select percentage from gst where hsn=?", nativeQuery = true)
	public int getByHsn(int hsn);

}
