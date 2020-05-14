package cn.com.websocket.api;

import cn.com.websocket.config.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class WebSocketApi {

    @Autowired
    private WebSocketServer webSocketServer;

    /**
     * 群发消息
     */
    @GetMapping("/")
    public String webSocketTest() throws IOException {
        webSocketServer.BroadCastInfo("接口发送消息");
        return "发送成功";
    }
}
