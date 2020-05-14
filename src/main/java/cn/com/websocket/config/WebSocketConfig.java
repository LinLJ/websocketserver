package cn.com.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {
    /**
     * 给spring容器注入这个ServerEndpointExporter对象
     * 检测所有带有@serverEndpoint注解的bean并注册他们
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        System.out.println("注入spring容器");
        return new ServerEndpointExporter();
    }
}