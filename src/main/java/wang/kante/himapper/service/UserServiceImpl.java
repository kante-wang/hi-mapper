package wang.kante.himapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.kante.himapper.entity.SysUser;
import wang.kante.himapper.mapper.SysUserMapper;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectOne(SysUser sysUser) {
        return sysUserMapper.selectOne(sysUser);
    }
}
