package com.ad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ad.entity.Tourist;
import com.ad.repo.ITouristRepo;

@Service("touristService")
public class TouristManagementServiceImpl implements ITouristManagementService {
      @Autowired
	private  ITouristRepo touristRepo;
	
	
	@Override
	public String registerTourist(Tourist tourist) {
		int idVal=touristRepo.save(tourist).getTid();
		return "Tourist is registered with the id value::"+idVal;
	}


	@Override
	public List<Tourist> fetchAllTourists() {
		List<Tourist>list=touristRepo.findAll();
		list.sort((t1,t2)->t1.getName().compareTo(t2.getName()));
		return list;
	}


	
	@Override
	public Tourist fetchTouristById(Integer tid) {
		
		return touristRepo.findById(tid);
	}


	
}



	