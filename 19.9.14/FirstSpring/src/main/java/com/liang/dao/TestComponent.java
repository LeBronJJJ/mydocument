package com.liang.dao;

import com.liang.firstspring.User;
import org.springframework.stereotype.Component;

@Component("testComponent")
public class TestComponent {
    public void useTools(User user){
        System.out.println("实用工具！");
    }
}
