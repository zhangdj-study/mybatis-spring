package org.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.test.config.MybatisSpringConfiguration;
import org.mybatis.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangdj
 * @date 2020/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MybatisSpringConfiguration.class})
public class MybatisSpringTest {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private ApplicationContext applicationContext;


  @Test
  public void test1() {
    System.out.println(userMapper.queryById(1L));
  }
}
