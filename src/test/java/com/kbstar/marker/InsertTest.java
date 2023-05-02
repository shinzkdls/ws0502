package com.kbstar.marker;

import com.kbstar.dto.Marker;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;

@Slf4j
@SpringBootTest
class InsertTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {
        Marker obj = new Marker(1, "title00", "target00", 1.1, 1.1, "image.jpg", "S");
        try {
            service.register(obj);
            log.info("등록정상");
        } catch (Exception e) {
            if (e instanceof DuplicateKeyException) {
                log.info("ID가 중복되었습니다.");
            } else {
                log.info("시스템 장애입니다.");
            }
        }
    }

}
