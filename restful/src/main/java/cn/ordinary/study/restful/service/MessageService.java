package cn.ordinary.study.restful.service;

import cn.ordinary.study.restful.entity.Message;
import cn.ordinary.study.restful.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/15
 */
@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;

    public Message loadByID(int id) {
        return messageMapper.loadByID(id);
    }

    public List<Message> load() {
        return messageMapper.load();
    }

    public void del(int id) {
        messageMapper.delete(id);
    }

    public void update(Message message) {
        messageMapper.update(message);
    }

    public void updateText(Message message) {
        messageMapper.updateText(message);
    }

    public void insert(Message message) {
        messageMapper.insert(message);
    }
}
