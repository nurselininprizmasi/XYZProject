package com.xyz.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 3.03.2017.
 */
@Repository
@Transactional
public class AdresDAO implements IAdresDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Map<String, Object>> getAdresBilgileriByKisiId(Integer kisiId) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select new map(a.id as id, ");
        sql.append("(Select t.aciklama FROM Tanim t WHERE t.ustTanimId =:ustTanimId AND t.aktif = true AND t.id = a.adresTipi) as adres_tipi, ");
        sql.append("(Select k1.aciklama FROM Konum k1 WHERE k1.id = a.ilId.id) as il, ");
        sql.append("(Select k2.aciklama FROM Konum k2 WHERE k2.id = a.ilceId.id) as ilce, ");
        sql.append("a.adresDetay1 as adres_detay1, ");
        sql.append("a.adresDetay2 as adres_detay2, ");
        sql.append("a.icKapiNo as ic_kapi_no, ");
        sql.append("a.disKapiNo as dis_kapi_no, ");
        sql.append("a.kisi.id as kisi_id ");
        sql.append(")");
        sql.append("FROM Adres a WHERE a.aktif = true ");
        sql.append("AND a.kisi.id = :kisiId");

        Query query = em.createQuery(sql.toString());
        query.setParameter("kisiId",kisiId);
        query.setParameter("ustTanimId",20);

        return query.getResultList();
    }
    @Override
    public List<Map<String, Object>> getAdresBilgileriById(Integer adresId) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select new map(a.id as id, ");
        sql.append(" a.adresTipi as adres_tipi, ");
        sql.append(" a.ilId.id as il_id, ");
        sql.append("a.ilceId.id as ilce_id, ");
        sql.append("a.adresDetay1 as adres_detay1, ");
        sql.append("a.adresDetay2 as adres_detay2, ");
        sql.append("a.icKapiNo as ic_kapi_no, ");
        sql.append("a.disKapiNo as dis_kapi_no ");
        sql.append(")");
        sql.append("FROM Adres a WHERE a.aktif = true ");
        sql.append("AND a.id = :adresId");

        Query query = em.createQuery(sql.toString());
        query.setParameter("adresId",adresId);

        return query.getResultList();
    }
}
