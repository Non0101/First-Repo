package com.zufangwang.service;

import java.util.List;

import com.zufangwang.entity.House;

public interface CategoryService {
  //ͨ���������ѯ����
  public List<House> queryByleibie(int category_id);
  //ͨ���۸���������ѯ����
  public List<House> queryByPrice(int startPrice,int endPrice);
  //ͨ�������������ѯ����
  public List<House> queryByRoomnumber(int roomnumber);
}
