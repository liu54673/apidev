package com.apidev.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Created by D.Yang on 2017/4/15.
 */
@Data
@EqualsAndHashCode
public class SysUser implements Serializable{
    /**编号*/
    private int id;
    /**名字*/
    private String uname;
    /**密码c*/
    private String upwd;
    /**年龄*/
    private int age;
    /**邮箱*/
    private String email;
}