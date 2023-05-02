package com.kbstar.markerdesc;

import com.kbstar.dto.MarkerDesc;
import com.kbstar.service.MarkerDescService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTest {
    @Autowired
    MarkerDescService service;

    @Test
    void contextLoads() {
        MarkerDesc markerDesc = null;
        try {
            markerDesc = service.get(15);
        } catch (Exception e) {
            log.info("error...");
            e.printStackTrace();
        }
    }

}
