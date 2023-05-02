package com.kbstar.sales;

import com.kbstar.dto.Sales;
import com.kbstar.service.SalesService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class InsertTest {
    @Autowired
    SalesService service;

    @Test
    void contextLoads() {
        //Adm obj = new Adm("admin04", "pwd04", 4);
        Sales obj = new Sales("2023-04-27", 25000, "F");
        try {
            service.register(obj);
            log.info("등록 정상");
            service.get();
        } catch (Exception e) {
            log.info("에러입니다.----------------------------------------");
        }
    }
}