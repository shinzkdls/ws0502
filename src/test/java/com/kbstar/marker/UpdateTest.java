package com.kbstar.marker;

import com.kbstar.dto.Marker;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class UpdateTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {
        Marker obj = new Marker(2000, "mi00", "target00", 1.1, 1.1, "image.jpg", "B");
        try {
            service.modify(obj);
            log.info("수정정상");
        } catch (Exception e) {

            log.info("시스템장애입니다.");

        }
    }

}
