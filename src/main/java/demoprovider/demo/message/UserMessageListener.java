package demoprovider.demo.message;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class UserMessageListener {


    //Spring Cloud Stream 提供的监听接口
    //监听定义好的输出通道
    @StreamListener(UserMessage.INPUT_1A)
    public void streamListenerOnMessage(String name) {
        System.out.println("Stream on  @StreamListener");
        System.out.println(name);
    }
}