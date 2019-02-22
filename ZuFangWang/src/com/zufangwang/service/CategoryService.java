package com.zufangwang.service;

import java.util.List;

import com.zufangwang.entity.House;

public interface CategoryService {
  //通过类别分类查询房屋
  public List<House> queryByleibie(int category_id);
  //通过价格区间分类查询房屋
  public List<House> queryByPrice(int startPrice,int endPrice);
  //通过房间数分类查询房屋
  public List<House> queryByRoomnumber(int roomnumber);
}
