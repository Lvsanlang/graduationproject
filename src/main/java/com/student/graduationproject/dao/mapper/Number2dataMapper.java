package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number2data.Number2data;
import com.student.graduationproject.model.number2data.Number2dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number2dataMapper {
    long countByExample(Number2dataExample example);

    int deleteByExample(Number2dataExample example);

    int insert(Number2data record);

    int insertSelective(Number2data record);

    List<Number2data> selectByExample(Number2dataExample example);

    int updateByExampleSelective(@Param("record") Number2data record, @Param("example") Number2dataExample example);

    int updateByExample(@Param("record") Number2data record, @Param("example") Number2dataExample example);

    List selectAll();

}