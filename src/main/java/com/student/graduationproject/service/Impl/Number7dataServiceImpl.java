package com.student.graduationproject.service.Impl;



import com.student.graduationproject.dao.mapper.Number6dataMapper;
import com.student.graduationproject.dao.mapper.Number7dataMapper;
import com.student.graduationproject.service.Number6dataService;
import com.student.graduationproject.service.Number7dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Number7dataServiceImpl implements Number7dataService {

    @Resource
    Number7dataMapper number7dataMapper;
    @Override
    public List select() {
        return number7dataMapper.selectAll();
    }
}
