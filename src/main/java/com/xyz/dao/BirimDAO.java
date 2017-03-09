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
public class BirimDAO implements IBirimDAO{

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Map<String, Object>> getBirimler(String filter) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT new map(b.id as id, b.birimAdi as birim_adi) ");
        sql.append("FROM Birim b WHERE b.aktif = true ");
        if(filter!=null){
            sql.append("AND LOWER(b.birimAdi) LIKE :filter ");
        }

        Query query = em.createQuery(sql.toString());
        if(filter!= null){
            query.setParameter("filter","%"+filter.toLowerCase()+"%");
        }
        return query.getResultList();
    }
}
