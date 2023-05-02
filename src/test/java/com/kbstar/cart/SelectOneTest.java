package com.kbstar.cart;

import com.kbstar.dto.Cart;
import com.kbstar.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTest {
    @Autowired
    CartService service;

    @Test
    void contextLoads() {
        Cart cart = null;
        try {
            cart = service.get(100);
        } catch (Exception e) {
            log.info("에러...");
            e.printStackTrace();
        }
    }
}
