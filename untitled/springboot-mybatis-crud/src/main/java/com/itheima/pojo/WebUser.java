package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebUser {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    private String phone;
}
