package com.kbstar.marker;

import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {
//          List<Adm> list=null;
        try {
//            list= service.get();
            service.get();
        } catch (Exception e) {
            log.info("error...");
            e.printStackTrace();
        }
    }

}
