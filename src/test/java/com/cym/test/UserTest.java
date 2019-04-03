package com.cym.test;

import com.cym.App;
import com.cym.dao.UsersMapper;
import com.cym.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UserTest {

  @Resource
  private UsersMapper usersMapper;

    @Test
    public void testAdd(){
        Users user = new Users();
        user.setPassword("456");
        user.setUserName("cym");
        //user.setId(1);

        usersMapper.insertSelective(user);
    }

}
