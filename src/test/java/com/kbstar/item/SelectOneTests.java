package com.kbstar.item;

import com.kbstar.dto.Item;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTests {
    @Autowired
    ItemService service;

    @Test
    void contextLoads() {
        Item item = null;

        try {
            item = service.get(100);

        } catch (Exception e) {

            log.info("......에러다.........");
            e.printStackTrace();
        }

    }
}

