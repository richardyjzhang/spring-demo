package me.zhangrichard.nacosconsumer;

import me.zhangrichard.nacoscommon.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(Source.class)
public class SendService {

    @Autowired
    private Source source;

    public void sendMessage(User user) {
        source.output().send(MessageBuilder.withPayload(user).build());
    }
}
