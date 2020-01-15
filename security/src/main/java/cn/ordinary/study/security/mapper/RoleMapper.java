package cn.ordinary.study.security.mapper;

import cn.ordinary.study.security.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ordinary
 * @date 2020-01-14
 */

@Mapper
@Repository
public interface RoleMapper {

    /**
     * 通过用户ID获取角色列表
     *
     * @param userID 用户ID
     * @return
     */
    @Select("SELECT A.id,A.name FROM role A LEFT JOIN user_role B ON A.id=B.role_id WHERE B.user_id=${userID}")
    List<Role> loadRolesByUserID(@Param("userID") Long userID);

}
