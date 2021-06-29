package com.student.graduationproject.service.Impl;

import com.student.graduationproject.dao.mapper.Number1dataMapper;
import com.student.graduationproject.dao.mapper.Number2dataMapper;
import com.student.graduationproject.service.Number1dataService;
import com.student.graduationproject.service.Number2dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Number2dataServiceImpl implements Number2dataService {

    @Resource
    Number2dataMapper number2dataMapper;

    @Override
    public List select() {
        return number2dataMapper.selectAll();
    }
}