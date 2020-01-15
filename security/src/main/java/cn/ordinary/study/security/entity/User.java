package cn.ordinary.study.security.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/14
 */
@Data
@Accessors(chain = true)
public class User implements UserDetails, Serializable {
    private Long id;
    private String username;
    private String password;
    private List<Role> authorities;


    /**
     * 账号是否过期
     *
     * @return 结果
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 账号IF欧被锁定
     *
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 用户密码是否过期
     *
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 用户是否可用
     *
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
