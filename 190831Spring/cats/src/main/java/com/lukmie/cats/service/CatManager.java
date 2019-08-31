package com.lukmie.cats.service;

import com.lukmie.cats.model.Cat;
import com.lukmie.cats.model.CreateCatRequest;
import com.lukmie.cats.model.Gender;
import com.lukmie.cats.repository.CatRepository;
import com.lukmie.cats.service.mapper.CatMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatManager implements InitializingBean {

    private CatRepository catRepository;

    public List<Cat> getCats() {
        return catRepository.findAll();
    }

    public void saveCat(CreateCatRequest catRequest) {
        Cat entity = CatMapper.map(catRequest);
        catRepository.save(entity);
    }

    @Autowired
    public CatManager(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        saveCat();
    }

    private void saveCat() {
        Cat cat = new Cat("Rys", 12, Gender.FEMALE);
        catRepository.save(cat);
    }


}
