package com.demo.dubbo.dubbobootservice.mapper;

import com.demo.dubbo.dubbobootapi.pojo.LoansCanal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoansCanalMapper {

    @Select("select * from bbt_loans_canal")
    List<LoansCanal> loansCanalList();

}
