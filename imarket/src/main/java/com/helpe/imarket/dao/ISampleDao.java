package com.helpe.imarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.helpe.imarket.entity.Sample;

public interface ISampleDao extends JpaRepository<Sample, Integer> {
	Sample findById(int id);
	
    @Query("select u from Sample u where u.id = :id")
    Sample getSampleRecord(@Param("id")int id);
    
}
