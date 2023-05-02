package com.kbstar.item;

import com.kbstar.dto.Item;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;

@Slf4j
@SpringBootTest
class InsertTests {
    @Autowired
    ItemService service;

    @Test
    void contextLoads() {
        Item obj = new Item(0, "티셔츠", 10000, "e.jpg", null);
        try {
            service.register(obj);
            service.get();
        } catch (Exception e) {
            if (e instanceof DuplicateKeyException) {
                log.info(".....상품ID가 중복되었습니다.......");
            } else {
                log.info("......시스템장애입니다.........");
                e.printStackTrace();
            }

        }
    }
}
