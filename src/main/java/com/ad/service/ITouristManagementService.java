package com.ad.service;

import java.util.List;

import com.ad.entity.Tourist;

public interface ITouristManagementService {
  public String registerTourist(Tourist tourist);
  public List<Tourist>fetchAllTourists();
  public Tourist fetchTouristById(Integer tid);
}
