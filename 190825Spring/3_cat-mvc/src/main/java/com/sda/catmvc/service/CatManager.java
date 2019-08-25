package com.sda.catmvc.service;

import com.sda.catmvc.config.HibernateUtil;
import com.sda.catmvc.model.Cat;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Service
public class CatManager implements InitializingBean {

    public void saveCat(Cat cat) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }

    public List<Cat> getCats() {
        EntityManager em = HibernateUtil.getEntityManager();
        CriteriaBuilder builder = HibernateUtil.getCriteriaBuilder();
        CriteriaQuery<Cat> criteria = builder.createQuery(Cat.class);
        criteria.from(Cat.class);
        return em.createQuery(criteria).getResultList();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        Cat cat = new Cat("Rys", "Kryptopies", 11);
        saveCat(cat);

    }
}
