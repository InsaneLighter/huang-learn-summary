package com.huang.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * user
 * @author 
 */
@Data
@ToString
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private Boolean sex;

    private String introduce;

    private static final long serialVersionUID = 1L;
}