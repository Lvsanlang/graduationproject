package com.student.graduationproject.service.Impl;

import com.student.graduationproject.dao.mapper.Number1dataMapper;
import com.student.graduationproject.dao.mapper.PlayerMapper;
import com.student.graduationproject.model.number1data.Number1data;
import com.student.graduationproject.service.Number1dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Number1dataServiceImpl implements Number1dataService {
    @Resource
    Number1dataMapper number1dataMapper;
    @Override
    public List select() {
        return number1dataMapper.selectAll();
    }
}
