package wang.kante.himapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.kante.himapper.entity.SysUser;
import wang.kante.himapper.service.UserService;
import wang.kante.himapper.util.ResultUtil;

import java.util.Map;

import static wang.kante.himapper.util.ResultUtil.STATE_OK_1;

/**
 * @author : wcw_2007@163.com
 * @Date: 2018/9/13 14:15
 * @Description: 通用mapper的各种查询操作
 */
@RestController
@RequestMapping(value = "/user")
public class UserSelectOneController {

    @Autowired
    UserService userService;

    /**
     *  selectOne
     *  SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE user_id = ?
     * @return
     */
    @RequestMapping(value = "/selectOne_param_id")
    @ResponseBody
    public Map<String, Object> selectOne_param_id(){
        SysUser user = new SysUser();
        user.setUserId(1);
        return ResultUtil.put(STATE_OK_1,userService.selectOne(user));
    }

    /**
     *  selectOne
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE user_id = ? AND user_account = ?
     *  ==> Parameters: 1(Integer), admin(String)
     *  <==      Total: 1
     * @return
     */
    @RequestMapping(value = "/selectOne_param_id_account")
    @ResponseBody
    public Map<String, Object> selectOne_param_id_account(){
        SysUser user = new SysUser();
        user.setUserId(1);
        user.setUserAccount("admin");
        return ResultUtil.put(STATE_OK_1,userService.selectOne(user));
    }

    /**
     *  selectOne
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE user_id = ?
     *  ==> Parameters: 100(Integer)
     *  <==      Total: 0
     * @return
     */
    @RequestMapping(value = "/selectOne_result_null")
    @ResponseBody
    public Map<String, Object> selectOne_result_null(){
        SysUser user = new SysUser();
        user.setUserId(100);
        return ResultUtil.put(STATE_OK_1,userService.selectOne(user));
    }

    /**
     * **************************************************************************
     * selectOne:
     * 条件查询，实体中有几个条件就查询出几个结果
     * 如果查询出多个结果，会报错
     * **************************************************************************
     */



}
