package com.kbstar.service;

import com.kbstar.dto.Adm;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.AdmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmService implements KBService<String, Adm> {

    @Autowired
    AdmMapper mapper;

    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param adm
     */
    @Override
    public void register(Adm adm) throws Exception {
        mapper.insert(adm);
    }

    @Override
    public void remove(String s) throws Exception {
        mapper.delete(s);
    }

    @Override
    public void modify(Adm adm) throws Exception {
        mapper.update(adm);
    }

    @Override
    public Adm get(String s) throws Exception {
        return mapper.select(s);
    }

    @Override
    public List<Adm> get() throws Exception {
        return mapper.selectall();
    }

}
