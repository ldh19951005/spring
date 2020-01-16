package cn.ordinary.study.restful.mapper;

import cn.ordinary.study.restful.entity.Message;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import javax.swing.event.ListSelectionEvent;
import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/15
 */
@Repository
public interface MessageMapper {

    /**
     * 通过ID获取留言信息
     *
     * @param id id
     * @return
     */
    @Select("select * from message where id=#{id}")
    Message loadByID(@Param("id") Integer id);

    /**
     * 查询所有的留言信息
     *
     * @return
     */
    @Select("select * from message")
    List<Message> load();

    /**
     * 修改留言信息
     *
     * @param message 留言
     * @return
     */
    @Update("update message set text=#{message.text},summary=#{message.summary} where id=#{message.id}")
    int update(@Param("message") Message message);

    /**
     * 删除留言
     *
     * @param id 留言ID
     * @return
     */
    @Delete("delete from message where id=#{id}")
    int delete(int id);

    /**
     * 修改留言
     *
     * @param message
     * @return
     */
    @Update("update message set text=#{message.text} where id=#{message.id}")
    int updateText(@Param("message") Message message);

    /**
     * 插入新数据
     *
     * @param message
     * @return
     */
    @Insert({"insert into message values(null,#{message.text},#{message.summary},#{message.createTime})"})
    int insert(@Param("message") Message message);
}
