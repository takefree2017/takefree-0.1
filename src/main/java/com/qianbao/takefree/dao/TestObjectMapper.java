package com.qianbao.takefree.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.qianbao.takefree.dataobject.TestObject;

public interface TestObjectMapper {
    @Select("select * from t_area where id=#{id}")
    public TestObject getById(int id);

    @Insert("insert into user(user_name,mobile) values(#{userName},#{mobile})")
    @Options(useGeneratedKeys=true,keyColumn="id",keyProperty="id")//设置id自增长
    public void save(TestObject grade);
}
