package com.kbstar.marker;

import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class DeleteTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {
        try {
            service.remove(100);
        } catch (Exception e) {
            log.info("시스템 장애입니다.");
        }
    }
}
