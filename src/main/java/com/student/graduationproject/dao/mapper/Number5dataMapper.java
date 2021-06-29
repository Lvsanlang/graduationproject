package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number5data.Number5data;
import com.student.graduationproject.model.number5data.Number5dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number5dataMapper {
    long countByExample(Number5dataExample example);

    int deleteByExample(Number5dataExample example);

    int insert(Number5data record);

    int insertSelective(Number5data record);

    List<Number5data> selectByExample(Number5dataExample example);

    int updateByExampleSelective(@Param("record") Number5data record, @Param("example") Number5dataExample example);

    int updateByExample(@Param("record") Number5data record, @Param("example") Number5dataExample example);

    List selectAll();
}