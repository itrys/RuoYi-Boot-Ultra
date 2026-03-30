package org.itrys.demo.controller;

import org.itrys.boot.domain.R;
import org.itrys.boot.domain.dto.PushPayloadDTO;
import org.itrys.boot.enums.PushSourceEnum;
import org.itrys.boot.enums.PushTypeEnum;
import org.itrys.boot.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * WebSocket 演示案例
 *
 * @author zendwang
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/demo/websocket")
@Slf4j
public class WebSocketController {

    private final MessageService messageService;

    /**
     * 发布消息
     *
     * @param userId 目标用户
     * @param message 发送内容
     */
    @GetMapping("/send")
    public R<Void> send(Long userId, String message) {
        PushPayloadDTO payload = PushPayloadDTO.of(
            PushTypeEnum.MESSAGE,
            PushSourceEnum.BACKEND,
            message,
            null
        );
        if (userId == null) {
            messageService.publishAll(payload);
        } else {
            messageService.publishMessage(List.of(userId), payload);
        }
        return R.ok("操作成功");
    }
}
