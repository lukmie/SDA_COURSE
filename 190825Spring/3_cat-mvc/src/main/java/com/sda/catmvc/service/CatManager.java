package com.sda.catmvc.service;

import com.sda.catmvc.config.HibernateUtil;
import com.sda.catmvc.model.Cat;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class CatManager implements InitializingBean {

    public void saveCat(Cat cat) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Cat cat = new Cat("Rys", "Kryptopies", 11);
        saveCat(cat);

    }
}
