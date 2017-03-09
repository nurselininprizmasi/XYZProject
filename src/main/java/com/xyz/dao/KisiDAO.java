package com.xyz.dao;

import com.xyz.model.Adres;
import com.xyz.model.Kisi;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Nursen on 25.02.2017.
 */
@Repository
@Transactional
public class KisiDAO implements IKisiDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Kisi> getKisiler(String ad, String soyAd, String birimId) {
        StringBuilder sql = new StringBuilder();
        sql.append("Select new map(k.id as ID,k.ad as ad, ");
        sql.append("k.soyad as soyad, ");
        sql.append("DATE_FORMAT(k.dogumTarihi,'%d/%m/%Y') as dogum_tarihi, ");
        sql.append("k.cinsiyet as cinsiyet, ");
        sql.append("k.medeniDurum as medeni_durum, ");
        sql.append("k.unvanId as unvan_id, ");
        sql.append("k.sicilNo as sicil_no, ");
        sql.append("k.aktif as aktif, ");
        sql.append("k.dogumYeri as dogum_yeri, ");
        sql.append("k.uyruk as uyruk,");
        sql.append("k.birimByBirimId.id as birim_id)");
        sql.append(" FROM Kisi k ");
        sql.append("WHERE k.aktif =true ");
        if (ad != "" && ad != null) {
            sql.append("AND lower(k.ad) LIKE :ad ");
        }
        if (soyAd != "" && soyAd != null) {
            sql.append("AND lower(k.soyad) LIKE :soyad ");
        }
        if (birimId != "" && birimId != null) {
            sql.append("AND k.birimByBirimId.id =:birimId ");
        }
        Query query = em.createQuery(sql.toString());

        if (ad != "" && ad != null) {
            query.setParameter("ad", "%" + ad.toLowerCase() + "%");
        }
        if (soyAd != "" && soyAd != null) {
            query.setParameter("soyad", "%" + soyAd.toLowerCase() + "%");
        }
        if (birimId != "" && birimId != null) {
            query.setParameter("birimId", Integer.parseInt(birimId));
        }

        return query.getResultList();

    }

    @Override
    public Adres getKisiAdresler(Integer kisiId, Integer adresTipi) {
        StringBuilder sql = new StringBuilder();
        sql.append("FROM Adres a WHERE a.kisi.id =:kisiId AND a.adresTipi =:adresTipi AND a.aktif = true");
        Query query = em.createQuery(sql.toString());
        query.setParameter("kisiId", kisiId);
        query.setParameter("adresTipi", adresTipi);

        if (query.getResultList().size() == 0) {
            return null;
        } else {
            return (Adres) query.getSingleResult();
        }
    }
}
