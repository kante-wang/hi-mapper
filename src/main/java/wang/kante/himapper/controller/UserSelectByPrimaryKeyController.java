package wang.kante.himapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.kante.himapper.mapper.SysUserMapper;
import wang.kante.himapper.util.ResultUtil;

import java.util.Map;

import static wang.kante.himapper.util.ResultUtil.STATE_OK_1;

/**
 * @author: wcw_2007@163.com
 * @Date: 2018/9/14 14:12
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserSelectByPrimaryKeyController {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     *  selectOne
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user
     *  ==> Parameters:
     *  <==      Total: 3
     * @return
     */
    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Map<String, Object> selectByPrimaryKey(){
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByPrimaryKey(1));
    }
}
