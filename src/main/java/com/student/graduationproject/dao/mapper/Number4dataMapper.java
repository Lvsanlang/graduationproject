package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number4data.Number4data;
import com.student.graduationproject.model.number4data.Number4dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number4dataMapper {
    long countByExample(Number4dataExample example);

    int deleteByExample(Number4dataExample example);

    int insert(Number4data record);

    int insertSelective(Number4data record);

    List<Number4data> selectByExample(Number4dataExample example);

    int updateByExampleSelective(@Param("record") Number4data record, @Param("example") Number4dataExample example);

    int updateByExample(@Param("record") Number4data record, @Param("example") Number4dataExample example);

    List selectAll();
}