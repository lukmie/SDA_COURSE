package com.lukmie.cats.service;

import com.lukmie.cats.exception.OwnerNotFoundException;
import com.lukmie.cats.model.CreateOwnerRequest;
import com.lukmie.cats.model.Owner;
import com.lukmie.cats.repository.OwnerRepository;
import com.lukmie.cats.service.mapper.OwnerMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnerManager implements InitializingBean {

    private OwnerRepository ownerRepository;

    @Autowired
    public OwnerManager(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    public void saveOwner(CreateOwnerRequest createOwnerRequest) {
        Owner entity = OwnerMapper.map(createOwnerRequest);

        ownerRepository.save(entity);
    }

    public void delete(Long id) {
        ownerRepository.findById(id).orElseThrow(OwnerNotFoundException::new);
        ownerRepository.deleteById(id);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Owner owner = new Owner("Marian");
        ownerRepository.save(owner);
    }
}
