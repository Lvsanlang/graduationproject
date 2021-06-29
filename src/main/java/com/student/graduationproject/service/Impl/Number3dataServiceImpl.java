package com.student.graduationproject.service.Impl;

import com.student.graduationproject.dao.mapper.Number3dataMapper;
import com.student.graduationproject.service.Number3dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Number3dataServiceImpl implements Number3dataService{
    @Resource
    Number3dataMapper number3dataMapper;
    @Override
    public List select() {
        return number3dataMapper.selectAll();
    }
}
