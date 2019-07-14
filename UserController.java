package com.fehead.security.controller;

import com.fehead.security.dataobject.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 写代码 敲快乐
 * だからよ...止まるんじゃねぇぞ
 * ▏n
 * █▏　､⺍
 * █▏ ⺰ʷʷｨ
 * █◣▄██◣
 * ◥██████▋
 * 　◥████ █▎
 * 　　███▉ █▎
 * 　◢████◣⌠ₘ℩
 * 　　██◥█◣\≫
 * 　　██　◥█◣
 * 　　█▉　　█▊
 * 　　█▊　　█▊
 * 　　█▊　　█▋
 * 　　 █▏　　█▙
 * 　　 █
 *
 * @author Nightnessss 2019/7/13 20:53
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "")
    public List<User> query(User user) {

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(user);
        System.out.println(user.toString());

        return users;
    }

    @GetMapping(value = "/{id:\\d+}")
    public User getInfo(@PathVariable(name = "id") String id) {
        User user = new User();
        user.setName("apple");
        System.out.println(user.toString());
        return user;
    }
}
