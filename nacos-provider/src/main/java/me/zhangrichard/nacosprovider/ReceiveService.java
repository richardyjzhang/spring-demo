package me.zhangrichard.nacosprovider;

import me.zhangrichard.nacoscommon.User;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class ReceiveService {

    @StreamListener(Sink.INPUT)
    public void receiveMessage(User user) {
        System.out.println(user.getName() + " was FUCKED.");
    }
}
