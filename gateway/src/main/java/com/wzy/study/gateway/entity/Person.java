package com.wzy.study.gateway.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 16:19
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private Integer sex; // 0 or 1
    private Boolean aBoolean; // 0 or 1
    private boolean ab; // 0 or 1
    private List list; // 0 or 1

    public Person(String name) {
        this.name = name;
    }
}
