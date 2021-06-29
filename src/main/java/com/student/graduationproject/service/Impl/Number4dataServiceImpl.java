package com.student.graduationproject.service.Impl;


import com.student.graduationproject.dao.mapper.Number4dataMapper;
import com.student.graduationproject.service.Number4dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Number4dataServiceImpl implements Number4dataService {

    @Resource
    Number4dataMapper number4dataMapper;
    @Override
    public List select() {
        return number4dataMapper.selectAll();
    }
}
