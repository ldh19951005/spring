package cn.ordinary.study.security.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ordinary
 * @date 2020/1/14
 */
@Data
@Accessors(chain = true)
public class RolePermission {
    private String url;
    private String roleName;
}
