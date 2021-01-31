package com.misaya.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version : V1.0
 * @ClassName: Department
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/25 19:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int id;
    private String departmentName;
}
