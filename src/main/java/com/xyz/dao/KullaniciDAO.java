package com.xyz.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Created by Nurşen on 20.2.2017.
 */
@Repository
@Transactional
public class KullaniciDAO implements IKullaniciDAO {
    @PersistenceContext
    EntityManager em;

    public boolean getKullaniciKontrol(String kullaniciAdi, String sifre) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select k.sifre FROM Kullanici k WHERE k.kullaniciAdi =:kullaniciAdi");
        Query query = em.createQuery(sql.toString());
        query.setParameter("kullaniciAdi", kullaniciAdi);

        String dbSifre = (String) query.getResultList().get(0);
        if (dbSifre.equals(sifre)) {

            return true;

        }else{

            return false;
        }

    }
}
