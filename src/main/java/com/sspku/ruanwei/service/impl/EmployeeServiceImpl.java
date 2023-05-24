package com.sspku.ruanwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sspku.ruanwei.entity.Employee;
import com.sspku.ruanwei.mapper.EmployeeMapper;
import com.sspku.ruanwei.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
