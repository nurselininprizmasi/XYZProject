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
public class KonumDAO implements IKonumDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Map<String, Object>> getIller(String filter) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select new map(k.id as il_id, k.aciklama as aciklama) FROM Konum k WHERE k.ustKonumId = 0 ");
        if (filter != null && filter != "") {
            sql.append("AND lower(k.aciklama) LIKE :filter");
        }
        Query query = em.createQuery(sql.toString());
        if (filter != null && filter != "") {
            query.setParameter("filter", "%" + filter.toLowerCase() + "%");
        }

        return query.getResultList();
    }

    @Override
    public List<Map<String, Object>> getIlcelerByIlId(String ilId, String filter) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select new map(k.id as ilce_id, k.ustKonumId as il_id, k.aciklama as aciklama) FROM Konum k WHERE k.ustKonumId <> 0 ");
        if (ilId != null && ilId != "") {
            sql.append("AND k.ustKonumId =:ilId");
        } if (filter != null && filter != "") {
            sql.append("AND lower(k.aciklama) LIKE :filter");
        }
        Query query = em.createQuery(sql.toString());
        if (ilId != null && ilId != "") {
            query.setParameter("ilId", Integer.parseInt(ilId));
        }
        if (filter != null && filter != "") {
            query.setParameter("filter", "%" + filter.toLowerCase() + "%");
        }

        return query.getResultList();
    }
}
