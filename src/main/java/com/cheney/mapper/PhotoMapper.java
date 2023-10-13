package com.cheney.mapper;

import com.cheney.pojo.Photo;

import java.util.List;

public interface PhotoMapper {
    void addPhoto(Photo photo);
    void deleteByIds(int[] ids);
    List<Photo> selectByPageAndCondition(Photo photo);
}
