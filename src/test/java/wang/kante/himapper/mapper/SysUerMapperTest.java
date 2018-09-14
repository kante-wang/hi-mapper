package wang.kante.himapper.mapper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import wang.kante.himapper.entity.SysUser;

/**
 * @Auther: wcw_2007@163.com
 * @Date: 2018/9/13 18:20
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
//@WebAppConfiguration
public class SysUerMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void selectOneTest(){
        SysUser user = new SysUser();
        user.setUserId(1);
        sysUserMapper.selectOne(user);
        Assert.assertSame("条数正确",1,sysUserMapper.selectOne(user).getUserId());
    }

    @Before
    public void init(){
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }


}
