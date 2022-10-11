package com.mybatis.plugins.mapper;

import com.mybatis.plugins.domain.User;

/**
* @author pcdn
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-10-10 20:31:31
* @Entity com.mybatis.plugins.domain.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
