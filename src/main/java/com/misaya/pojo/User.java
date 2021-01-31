package com.misaya.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version : V1.0
 * @ClassName: User
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/2/25 19:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;
}
