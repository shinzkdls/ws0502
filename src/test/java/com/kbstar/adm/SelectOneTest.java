package com.kbstar.adm;

import com.kbstar.dto.Adm;
import com.kbstar.service.AdmService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTest {
    @Autowired
    AdmService service;

    @Test
    void contextLoads() {
        Adm adm = null;
        try {
            adm = service.get("admin4");
        } catch (Exception e) {
            log.info("에러...");
            e.printStackTrace();
        }
    }
}
