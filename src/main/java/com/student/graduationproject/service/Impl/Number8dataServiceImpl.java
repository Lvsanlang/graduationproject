package com.student.graduationproject.service.Impl;



import com.student.graduationproject.dao.mapper.Number7dataMapper;
import com.student.graduationproject.dao.mapper.Number8dataMapper;
import com.student.graduationproject.model.number8data.Number8data;
import com.student.graduationproject.service.Number7dataService;
import com.student.graduationproject.service.Number8dataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Number8dataServiceImpl implements Number8dataService {

    @Resource
    Number8dataMapper number8dataMapper;

    @Override
    public List selectname() {
        return number8dataMapper.selectname();
    }

    @Override
    public List selectAll(Number8data number8data) {
        return number8dataMapper.selectAll(number8data);
    }
}
