package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number3data.Number3data;
import com.student.graduationproject.model.number3data.Number3dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number3dataMapper {
    long countByExample(Number3dataExample example);

    int deleteByExample(Number3dataExample example);

    int insert(Number3data record);

    int insertSelective(Number3data record);

    List<Number3data> selectByExample(Number3dataExample example);

    int updateByExampleSelective(@Param("record") Number3data record, @Param("example") Number3dataExample example);

    int updateByExample(@Param("record") Number3data record, @Param("example") Number3dataExample example);

    List selectAll();
}