package cn.ordinary.study.security.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author ordinary
 * @date 2020/1/14
 */
@Data
@Accessors(chain = true)
public class Role implements GrantedAuthority {

    private Long id;
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
