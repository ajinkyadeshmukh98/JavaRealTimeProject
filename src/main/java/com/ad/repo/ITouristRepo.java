package com.ad.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ad.entity.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}
