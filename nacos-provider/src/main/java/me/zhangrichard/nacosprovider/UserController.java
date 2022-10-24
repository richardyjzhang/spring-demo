package me.zhangrichard.nacosprovider;

import me.zhangrichard.nacoscommon.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = userMapper.getAllUsers();
        return users;
    }

}
