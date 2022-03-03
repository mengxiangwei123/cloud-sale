package com.jk.service;

import com.jk.po.SaleBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name="sale-provider")
public interface SaleService {
    @GetMapping("sale/querySale")
    List<SaleBean> querySale();
}
