package com.jk.po;

import lombok.Data;

import java.util.Date;
@Data
public class SaleBean {
    private Integer id;
    private String name;
    private String type;
    private String scope;
    private Integer statu;
    private Date date;
}
