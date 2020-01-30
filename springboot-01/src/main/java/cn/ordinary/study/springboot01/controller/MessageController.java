package cn.ordinary.study.springboot01.controller;

import cn.ordinary.study.springboot01.entity.Message;
import cn.ordinary.study.springboot01.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/15
 */
@RestController
@RequestMapping("/Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/{id}")
    public Message get(@PathVariable int id) {
        Message message = messageService.loadByID(id);
        return message;
    }

    @GetMapping("")
    public List<Message> get() {
        return messageService.load();
    }

    @PutMapping("")
    public Message put(Message message) {
        messageService.update(message);
        return messageService.loadByID(message.getId());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        messageService.del(id);
    }

    @PostMapping("")
    public void insert(Message message) {
        message.setCreateTime(LocalDateTime.now());
        messageService.insert(message);
    }
}
