package cn.ordinary.study.security.service;

import cn.ordinary.study.security.entity.Role;
import cn.ordinary.study.security.entity.User;
import cn.ordinary.study.security.mapper.RoleMapper;
import cn.ordinary.study.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/14
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(userName);
        if (null != user) {
            List<Role> roles = roleMapper.loadRolesByUserID(user.getId());
            user.setAuthorities(roles);
        }
        return user;
    }
}
