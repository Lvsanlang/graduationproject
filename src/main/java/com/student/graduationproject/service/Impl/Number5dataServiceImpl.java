package com.student.graduationproject.service.Impl;



import com.student.graduationproject.dao.mapper.Number5dataMapper;
import com.student.graduationproject.service.Number5dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Number5dataServiceImpl implements Number5dataService {

    @Resource
    Number5dataMapper number5dataMapper;
    @Override
    public List select() {
        return number5dataMapper.selectAll();
    }
}
