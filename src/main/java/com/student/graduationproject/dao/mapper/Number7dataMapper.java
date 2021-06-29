package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number7data.Number7data;
import com.student.graduationproject.model.number7data.Number7dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number7dataMapper {
    long countByExample(Number7dataExample example);

    int deleteByExample(Number7dataExample example);

    int insert(Number7data record);

    int insertSelective(Number7data record);

    List<Number7data> selectByExample(Number7dataExample example);

    int updateByExampleSelective(@Param("record") Number7data record, @Param("example") Number7dataExample example);

    int updateByExample(@Param("record") Number7data record, @Param("example") Number7dataExample example);

    List selectAll();

}