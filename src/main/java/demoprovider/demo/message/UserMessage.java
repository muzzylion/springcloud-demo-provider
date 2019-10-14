package demoprovider.demo.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserMessage {

    String INPUT_1A = "input_1A";

    //定义输出源
    // 这里就是Spring Cloud Stream提供的输入通道
    @Input(INPUT_1A)
    SubscribableChannel input_1A();
}
