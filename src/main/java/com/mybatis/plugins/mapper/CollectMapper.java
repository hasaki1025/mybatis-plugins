package com.mybatis.plugins.mapper;

import com.mybatis.plugins.domain.Collect;

/**
* @author pcdn
* @description 针对表【collect】的数据库操作Mapper
* @createDate 2022-10-10 20:31:31
* @Entity com.mybatis.plugins.domain.Collect
*/
public interface CollectMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

}
