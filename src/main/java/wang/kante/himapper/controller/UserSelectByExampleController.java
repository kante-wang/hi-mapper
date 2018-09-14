package wang.kante.himapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import wang.kante.himapper.entity.SysUser;
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
public class UserSelectByExampleController {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     *  selectByExample
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE ( user_id = ? )
     *  ==> Parameters: 1(Integer)
     *  <==      Total: 1
     * @return
     */
    @RequestMapping(value = "/selectByExample_userId")
    @ResponseBody
    public Map<String, Object> selectByExample_userId(){
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("userId",1);
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByExample(example));
    }

    /**
     *  selectByExample
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE ( user_id = ? )
     *  ==> Parameters: 1(Integer)
     *  <==      Total: 1
     * @return
     */
    @RequestMapping(value = "/selectByExample_userAccount")
    @ResponseBody
    public Map<String, Object> selectByExample_userAccount(){
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("userAccount","admin");
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByExample(example));
    }

    /**
     *  selectByExample
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE ( user_account like ? )
     *  ==> Parameters: %in(String)
     *  <==      Total: 1
     * @return
     */
    @RequestMapping(value = "/selectByExample_like_userAccount")
    @ResponseBody
    public Map<String, Object> selectByExample_like_userAccount(){
        Example example = new Example(SysUser.class);
        example.createCriteria().andLike("userAccount","%in");
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByExample(example));
    }

    /**
     *  selectByExample
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE ( create_time > ? )
     *  ==> Parameters: 2018-02-01(String)
     *  <==      Total: 3
     * @return
     */
    @RequestMapping(value = "/selectByExample_andGreaterThan_userAccount")
    @ResponseBody
    public Map<String, Object> selectByExample_andGreaterThan_userAccount(){
        Example example = new Example(SysUser.class);
        example.createCriteria().andGreaterThan("createTime","2018-02-01");
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByExample(example));
    }

    /**
     *  selectByExample
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE ( 333 )
     *  ==> Parameters:
     *  <==      Total: 3
     * @return
     */
    @RequestMapping(value = "/selectByExample_andCondition")
    @ResponseBody
    public Map<String, Object> selectByExample_andCondition(){
        Example example = new Example(SysUser.class);
        example.createCriteria().andCondition("333");
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByExample(example));
    }

    /**
     *  selectByExample
     *  ==>  Preparing: SELECT user_id,user_account,user_password,user_role_id,user_status,create_time,update_time FROM sys_user WHERE ( userId = ? )
     *  ==> Parameters: 1(String)
     *
     *; bad SQL grammar []; nested exception is com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Unknown column 'userId' in 'where clause'] with root cause
     *
     * @return
     */
    @RequestMapping(value = "/selectByExample_andCondition2")
    @ResponseBody
    public Map<String, Object> selectByExample_andCondition2(){
        Example example = new Example(SysUser.class);
        example.createCriteria().andCondition("userId = ","1");
        return ResultUtil.put(STATE_OK_1,sysUserMapper.selectByExample(example));
    }
}
