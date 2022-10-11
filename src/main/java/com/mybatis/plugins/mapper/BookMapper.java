package com.mybatis.plugins.mapper;

import com.mybatis.plugins.domain.Book;

/**
* @author pcdn
* @description 针对表【book】的数据库操作Mapper
* @createDate 2022-10-10 20:31:31
* @Entity com.mybatis.plugins.domain.Book
*/
public interface BookMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

}
