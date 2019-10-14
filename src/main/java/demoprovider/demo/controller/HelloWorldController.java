package demoprovider.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * 获取当前服务端口
     */
    @Value("${server.port}")
    private String port;

    /**
     * 简单的测试 rest接口
     * @param name
     * @return
     */
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello {" + name + " } from port : " + port;
    }
}