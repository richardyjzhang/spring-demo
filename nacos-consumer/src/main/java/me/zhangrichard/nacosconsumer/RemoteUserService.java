package me.zhangrichard.nacosconsumer;

import me.zhangrichard.nacoscommon.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("nacos-provider")
public interface RemoteUserService {

    @GetMapping("/users")
    List<User> getUsers();
}
