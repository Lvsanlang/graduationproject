package com.student.graduationproject.dao.mapper;

import com.student.graduationproject.model.number6data.Number6data;
import com.student.graduationproject.model.number6data.Number6dataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Number6dataMapper {
    long countByExample(Number6dataExample example);

    int deleteByExample(Number6dataExample example);

    int insert(Number6data record);

    int insertSelective(Number6data record);

    List<Number6data> selectByExample(Number6dataExample example);

    int updateByExampleSelective(@Param("record") Number6data record, @Param("example") Number6dataExample example);

    int updateByExample(@Param("record") Number6data record, @Param("example") Number6dataExample example);

    List selectAll();
}