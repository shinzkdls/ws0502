package com.kbstar.marker;

import com.kbstar.dto.Marker;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SelectLocTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {
        List<Marker> list = null;
        try {
            list = service.getLoc("s");
        } catch (Exception e) {
            log.info("error...");
            e.printStackTrace();
        }
    }

}
