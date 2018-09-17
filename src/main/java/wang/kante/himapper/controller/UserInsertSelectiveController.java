package wang.kante.himapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.kante.himapper.entity.SysUser;
import wang.kante.himapper.mapper.SysUserMapper;
import wang.kante.himapper.util.ResultUtil;

import java.util.Date;
import java.util.Map;

import static wang.kante.himapper.util.ResultUtil.STATE_OK_1;

/**
 * @author: wcw_2007@163.com
 * @Date: 2018/9/14 13:57
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserInsertSelectiveController {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     *  selectOne
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user
     *  ==> Parameters:
     *  <==      Total: 3
     * @return
     */
    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public Map<String, Object> insertSelective(){
        SysUser user = new SysUser();
        user.setUserAccount("admin");
        user.setUserPassword("123456");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return ResultUtil.put(STATE_OK_1,sysUserMapper.insertSelective(user));
    }
}
