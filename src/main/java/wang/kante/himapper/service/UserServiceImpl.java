package wang.kante.himapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.kante.himapper.entity.SysUser;
import wang.kante.himapper.mapper.SysUserMapper;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;



    @Override
    public List<SysUser> selectUser(SysUser sysUser) {
        return sysUserMapper.selectAll();
    }

}
