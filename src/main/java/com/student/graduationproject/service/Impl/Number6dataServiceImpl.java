package com.student.graduationproject.service.Impl;



import com.student.graduationproject.dao.mapper.Number5dataMapper;
import com.student.graduationproject.dao.mapper.Number6dataMapper;
import com.student.graduationproject.service.Number5dataService;
import com.student.graduationproject.service.Number6dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Number6dataServiceImpl implements Number6dataService {

    @Resource
    Number6dataMapper number6dataMapper;
    @Override
    public List select() {
        return number6dataMapper.selectAll();
    }
}
