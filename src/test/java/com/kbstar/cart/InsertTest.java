package com.kbstar.cart;

import com.kbstar.dto.Cart;
import com.kbstar.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;

@Slf4j
@SpringBootTest
class InsertTest {
    @Autowired
    CartService service;

    @Test
    void contextLoads() {
        Cart obj = new Cart("id03", 101, 3);
        try {
            service.register(obj);
            service.get();
        } catch (Exception e) {
            if (e instanceof DuplicateKeyException) {
                log.info("ID가 중복되었습니다.--------------------------------------");
            } else {
                log.info("시스템 장애입니다.----------------------------------------");
            }
        }
    }

}
