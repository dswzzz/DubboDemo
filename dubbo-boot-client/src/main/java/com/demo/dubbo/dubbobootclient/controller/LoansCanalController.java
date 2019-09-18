package com.demo.dubbo.dubbobootclient.controller;

import com.demo.dubbo.dubbobootapi.pojo.LoansCanal;
import com.demo.dubbo.dubbobootapi.service.LoansCanalList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LoansCanalController {

    @Resource
    private LoansCanalList loansCanalList;

    @RequestMapping("list")
    public List<LoansCanal> list(){
        return loansCanalList.loansCanalList();
    }
}
