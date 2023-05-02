package com.kbstar.marker;

import com.kbstar.dto.Marker;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {
        Marker marker = null;
        try {
            marker = service.get(100);
        } catch (Exception e) {
            log.info("error...");
            e.printStackTrace();
        }
    }

}
