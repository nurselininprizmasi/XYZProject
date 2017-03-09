package com.xyz.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 26.02.2017.
 */
@Repository
@Transactional
public class TanimDAO implements ITanimDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Map<String, Object>> getTanimlarByUstTanimId(Integer ustTanimId, String filter) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select new map (t.id as id ,t.aciklama as aciklama) FROM Tanim t WHERE t.ustTanimId =:ustTanimId AND t.aktif = true ");
        if (filter != null) {
            sql.append("AND lower(t.aciklama) =:filter");
        }
        Query query = em.createQuery(sql.toString());
        query.setParameter("ustTanimId", ustTanimId);
        if (filter != null) {
            query.setParameter("filter", "%" + filter.toLowerCase() + "%");
        }
        return query.getResultList();
    }
}
