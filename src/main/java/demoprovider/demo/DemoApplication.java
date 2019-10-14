package demoprovider.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import demoprovider.demo.message.UserMessage;

@EnableDiscoveryClient  //服务客户端注册
@SpringBootApplication
@EnableBinding(UserMessage.class)  //绑定Spring Cloud Stream 定义好的通道接口
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
