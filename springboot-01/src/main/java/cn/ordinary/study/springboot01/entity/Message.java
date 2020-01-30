package cn.ordinary.study.springboot01.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author ordinary
 * @date 2020/1/15
 */
@Data
@Accessors(chain = true)
public class Message {
    private Integer id;
    private String text;
    private String summary;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
