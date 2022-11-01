package me.zhangrichard.nacosconsumer;

import me.zhangrichard.nacoscommon.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    RemoteUserService userService;

    @Autowired
    SendService sendService;

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        return users;
    }

    @GetMapping("/fuck/{userName}")
    public void getFuckers(@PathVariable("userName") String userName) {
        User user = new User();
        user.setId(0L);
        user.setName(userName);
        sendService.sendMessage(user);
    }

}
