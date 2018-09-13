package wang.kante.himapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.kante.himapper.entity.SysUser;
import wang.kante.himapper.service.UserService;

import java.util.List;

/**
 * @Auther: 王传伟
 * @Date: 2018/9/13 14:15
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/abc")
    @ResponseBody
    public List<SysUser> abc(){
        SysUser user = new SysUser();
        user.setUserId(1);
        return  userService.selectUser(user);
    }
}
