package cn.ordinary.study.security.mapper;

import cn.ordinary.study.security.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author ordinary
 * @date 2020-01-14
 */

@Mapper
@Repository
public interface UserMapper {

    /**
     * 通过用户名获取用户信息
     *
     * @param username 用户名
     * @return
     */
    @Select("select id , username , password from user where username = #{username}")
    User loadUserByUsername(@Param("username") String username);

}
