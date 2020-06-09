package com.sun.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * @author SunG
 * @date 2020/6/8 9:45
 */
@Data
@AllArgsConstructor
public class User {

    private String name;
    private int age;
}
