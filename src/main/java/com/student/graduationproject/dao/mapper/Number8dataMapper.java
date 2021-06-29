package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number8data.Number8data;
import com.student.graduationproject.model.number8data.Number8dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number8dataMapper {

    long countByExample(Number8dataExample example);

    int deleteByExample(Number8dataExample example);

    int insert(Number8data record);

    int insertSelective(Number8data record);

    List<Number8data> selectByExample(Number8dataExample example);

    int updateByExampleSelective(@Param("record") Number8data record, @Param("example") Number8dataExample example);

    int updateByExample(@Param("record") Number8data record, @Param("example") Number8dataExample example);

    List selectname();

    List selectAll(Number8data number8data);
}