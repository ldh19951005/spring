package cn.ordinary.study.security.mapper;

import cn.ordinary.study.security.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/14
 */
@Mapper
@Repository
public interface PermissionMapper {

    /**
     * 获取角色权限列表
     *
     * @return
     */
    @Select("SELECT A.NAME AS roleName,C.url FROM role AS A LEFT JOIN role_permission B ON A.id=B.role_id LEFT JOIN permission AS C ON B.permission_id=C.id")
    List<RolePermission> getRolePermissions();

}
