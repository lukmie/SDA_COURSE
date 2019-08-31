package com.lukmie.cats.service;

import com.lukmie.cats.exception.CatNotFoundException;
import com.lukmie.cats.model.Cat;
import com.lukmie.cats.model.CreateCatRequest;
import com.lukmie.cats.model.Gender;
import com.lukmie.cats.model.UpdateCatRequest;
import com.lukmie.cats.repository.CatRepository;
import com.lukmie.cats.service.mapper.CatMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatManager implements InitializingBean {

    private CatRepository catRepository;

    @Autowired
    public CatManager(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getCats() {
        return catRepository.findAll();
    }

    public void saveCat(CreateCatRequest catRequest) {
        Cat entity = CatMapper.map(catRequest);
        catRepository.save(entity);
    }

    public void delete(Long id) {
        catRepository.findById(id).orElseThrow(CatNotFoundException::new);
        catRepository.deleteById(id);
    }

    public void updateCat(Long id, UpdateCatRequest updateCatRequest) {
        Cat cat = catRepository.findById(id).orElseThrow(CatNotFoundException::new);
        cat.setName(updateCatRequest.getName());
        cat.setTailLength(updateCatRequest.getTailLength());
        cat.setGender(updateCatRequest.getGender());
        catRepository.save(cat);
    }

    public void patchCat(Long id, UpdateCatRequest updateCatRequest) {
        Cat cat = catRepository.findById(id).orElseThrow(CatNotFoundException::new);
        // java 7
//        if (updateCatRequest.getName() != null) {
//            cat.setName(updateCatRequest.getName());
//        }
//        if (updateCatRequest.getGender() != null) {
//            cat.setGender(updateCatRequest.getGender());
//        }
//        if (updateCatRequest.getTailLength() != null) {
//            cat.setTailLength(updateCatRequest.getTailLength());
//        }
        // java8
        Optional.ofNullable(updateCatRequest.getName()).ifPresent(cat::setName);
        Optional.ofNullable(updateCatRequest.getGender()).ifPresent(cat::setGender);
        Optional.ofNullable(updateCatRequest.getTailLength()).ifPresent(cat::setTailLength);
        catRepository.save(cat);
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
