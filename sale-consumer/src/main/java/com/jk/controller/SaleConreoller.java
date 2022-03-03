package com.jk.controller;

import com.jk.po.SaleBean;
import com.jk.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SaleConreoller {
    @Autowired
    private SaleService ser;
    @GetMapping("querySale")
    @ResponseBody
    public List<SaleBean> querySale(){

        return ser.querySale();
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/BookShow")
    public String BookShow(){
        return "BookShow";
    }
}
