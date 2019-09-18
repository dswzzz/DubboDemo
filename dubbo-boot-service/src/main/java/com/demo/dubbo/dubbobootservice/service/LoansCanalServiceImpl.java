package com.demo.dubbo.dubbobootservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.dubbobootapi.pojo.LoansCanal;
import com.demo.dubbo.dubbobootapi.service.LoansCanalService;
import com.demo.dubbo.dubbobootservice.mapper.LoansCanalMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoansCanalServiceImpl implements LoansCanalService {

    @Resource
    private LoansCanalMapper loansCanalMapper;

    @Override
    public List<LoansCanal> loansCanalList() {
        return loansCanalMapper.loansCanalList();
    }

}
