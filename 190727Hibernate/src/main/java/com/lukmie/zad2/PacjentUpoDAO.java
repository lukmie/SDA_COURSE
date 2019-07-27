package com.lukmie.zad2;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.PacjentUpo;
import com.lukmie.entity.Upowazniony;
import com.lukmie.zad1.DAO;
import org.hibernate.Session;

import java.sql.Date;
import java.time.LocalDate;

public class PacjentUpoDAO extends DAO<PacjentUpo> {

    private PacjentUpo pacjentUpo = new PacjentUpo();

    @Override
    public void add(PacjentUpo pacjentUpo) {
        super.add(pacjentUpo);
    }

    public PacjentUpo select(Integer id) {
        return super.select(id, pacjentUpo);
    }

    @Override
    public PacjentUpo update(PacjentUpo pacjentUpo) {
        return super.update(pacjentUpo);
    }

    public void delete(Integer id) {
        pacjentUpo.setId(id);
        super.delete(id, pacjentUpo);
    }

    public void insertOrUpdatePersonI(Upowazniony upowazniony, Integer nrPeselPacjenta, Integer nrUpowaznionego) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        PacjentUpo pacjentUpo = session.createNamedQuery("pacjentUpo.findByPesel", PacjentUpo.class).setParameter("pesel", nrPeselPacjenta).getSingleResult();
//        PacjentUpo pacjentUpo = session.createNativeQuery("SELECT * FROM PacjentUpo p WHERE p.pesel=:pesel", PacjentUpo.class)
//                .setParameter("pesel", nrPeselPacjenta).getSingleResult();
        if (nrUpowaznionego == 1) {
            pacjentUpo.setUpowaznionyI(upowazniony);
            pacjentUpo.getUpowaznionyI().setDataDodaniaUpoI(Date.valueOf(LocalDate.now()));
        } else if (nrUpowaznionego == 2) {
            pacjentUpo.setUpowaznionyII(upowazniony);
            pacjentUpo.getUpowaznionyII().setDataDodaniaUpoI(Date.valueOf(LocalDate.now()));
        } else {
            pacjentUpo.setUpowaznionyIII(upowazniony);
            pacjentUpo.getUpowaznionyIII().setDataDodaniaUpoI(Date.valueOf(LocalDate.now()));
        }
        session.merge(pacjentUpo);
        session.flush();
        session.close();
    }

    public boolean verifyUPO(Upowazniony upowazniony, Integer nrPeselPacjenta) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        boolean flag = false;
        PacjentUpo pacjentUpo = session.createNamedQuery("pacjentUpo.findByPesel", PacjentUpo.class).setParameter("pesel", nrPeselPacjenta).getSingleResult();
        if (pacjentUpo.getUpowaznionyI() != null && pacjentUpo.getUpowaznionyI().equals(upowazniony)) {
            flag = true;
        } else if (pacjentUpo.getUpowaznionyII() != null && pacjentUpo.getUpowaznionyII().equals(upowazniony)) {
            flag = true;
        } else if (pacjentUpo.getUpowaznionyIII() != null && pacjentUpo.getUpowaznionyIII().equals(upowazniony)) {
            flag = true;
        }
        session.flush();
        session.close();
        return flag;
    }

}
