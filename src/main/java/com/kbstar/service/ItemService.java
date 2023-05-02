package com.kbstar.service;

import com.kbstar.dto.Item;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.ItemMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItemService implements KBService<Integer, Item> {

    @Autowired
    ItemMapper mapper;

    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param item
     */
    @Override
    public void register(Item item) throws Exception {
        mapper.insert(item);
    }

    @Override
    public void remove(Integer i) throws Exception {
        mapper.delete(i);
    }

    @Override
    public void modify(Item item) throws Exception {
        mapper.update(item);
    }

    @Override
    public Item get(Integer i) throws Exception {
        return mapper.select(i);
    }

    @Override
    public List<Item> get() throws Exception {
        return mapper.selectall();
    }

}