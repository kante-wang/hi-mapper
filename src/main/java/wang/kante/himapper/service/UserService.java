package wang.kante.himapper.service;



import wang.kante.himapper.entity.SysUser;

import java.util.List;

public interface UserService {

    List<SysUser> selectUser(SysUser sysUser);
}
