package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number1data.Number1data;
import com.student.graduationproject.model.number1data.Number1dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number1dataMapper {
    long countByExample(Number1dataExample example);

    int deleteByExample(Number1dataExample example);

    int insert(Number1data record);

    int insertSelective(Number1data record);

    List<Number1data> selectByExample(Number1dataExample example);

    int updateByExampleSelective(@Param("record") Number1data record, @Param("example") Number1dataExample example);

    int updateByExample(@Param("record") Number1data record, @Param("example") Number1dataExample example);

    List selectAll();
}