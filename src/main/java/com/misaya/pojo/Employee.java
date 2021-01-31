package com.misaya.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


/**
 * @version : V1.0
 * @ClassName: Employee
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/25 19:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String employeeName;
    private String email;
    private int gender;
    private int departmentId;
    private Date date;
}
