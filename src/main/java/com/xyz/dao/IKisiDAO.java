package com.xyz.dao;

import com.xyz.model.Adres;
import com.xyz.model.Kisi;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Nursen on 25.02.2017.
 */
@Repository
@Transactional
public interface IKisiDAO {
    /**
     * gelen parametrelere göre kisi listesini döndürür
     * @param ad String ad parametresini içerir
     * @param soyAd String soyad parametresini içerir
     * @param birimId Birim parametresini içerir
     * @return sonuçları Lisr<Kisi> olarak döndürür
     */
    List<Kisi> getKisiler(String ad, String soyAd, String birimId);

    /**
     * Adres bilgilerinin kisiId ye göre getirilmesini sağlar
     * @param kisiId kisiId parametresini içerir
     * @param adresTipi
     * @return
     */
    Adres getKisiAdresler(Integer kisiId, Integer adresTipi);
}
