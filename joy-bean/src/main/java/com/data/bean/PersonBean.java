package com.data.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonBean implements Serializable {
    private static final long serialVersionUID = 4874719071117898342L;

    private Integer id;
    private String name;
    private String addr;
    private String birthday;
}
