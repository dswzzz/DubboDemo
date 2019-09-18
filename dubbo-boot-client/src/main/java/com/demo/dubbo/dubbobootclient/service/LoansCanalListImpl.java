package com.demo.dubbo.dubbobootclient.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.dubbobootapi.pojo.LoansCanal;
import com.demo.dubbo.dubbobootapi.service.LoansCanalList;
import com.demo.dubbo.dubbobootapi.service.LoansCanalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansCanalListImpl implements LoansCanalList {
    @Reference
    private LoansCanalService loansCanalService;
    @Override
    public List<LoansCanal> loansCanalList() {
        return loansCanalService.loansCanalList();
    }
}
