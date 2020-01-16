package com.lh;

import com.lh.domain.User;
import com.lh.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description: springboot集成Junit
 * @author LuoH
 * @date 2020/01/16
 */
@RunWith(SpringRunner.class)//谁去执行
@SpringBootTest(classes = SpringbootMybatisApplication.class)//引导类
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}
