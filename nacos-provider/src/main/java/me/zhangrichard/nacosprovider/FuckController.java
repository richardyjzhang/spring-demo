package me.zhangrichard.nacosprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuckController {

    @GetMapping("/fuck")
    public String GetFucking() {
        return "FUCK YOU";
    }

}
