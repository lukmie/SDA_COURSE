package com.lukmie.zad3.dao;

public class ProducentDAO extends DAO{

//    public void addProducent(Producent producent) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.persist(producent);
//        session.flush();
//        session.close();
//        System.out.println("Dodano uzytkownika o id = " + producent.getId_producenta() + ".");
//    }


    @Override
    public void addProducent(Object object) {
        super.addProducent(object);
    }
}
