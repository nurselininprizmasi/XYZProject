package com.xyz.bus;

import com.xyz.model.Kisi;
import net.sf.json.JSONObject;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 25.02.2017.
 */
public interface IKisiBUS {
    /**
     *
     * @param parameterMap sorgu için gelen parametreleri içerir
     * @return sonuclar List<Kisi> olarak döndürür
     */
    List<Kisi> getKisiler(Map<String, Object[]> parameterMap);

    /**
     * Kişi kayıt işlemini ve güncelleme işlemini yapar
     * @param data form üzerindeki kayıt bilgilerini içerir
     * @return
     * @throws ParseException
     */
    JSONObject saveOrUpdateKisi(Map<String, String[]> data) throws ParseException;

    /**
     * Kisilerin adres bilgilerini getirir
     * @param kisiId kisiId bilgisini içerir
     * @return
     */
    JSONObject getAdresBilgileriByKisiId(String kisiId);

    /**
     * AdresId blgisine göre adres bilgilerini getirir
     * @param adresId
     * @return
     */
    List<Map<String,Object>> getAdresBilgileriById(String adresId);

    /**
     * Seçilen adres bilgisinin silinmesini sağlar
     * @param adresId adresId bilgisini içerir
     * @return
     */
    JSONObject removeAdresBilgisiByAdresId(String adresId);

    /**
     * Adres Bilgilerinin kaydedilmesi ve ya güncellenmesi işlemleri için kullanılır
     * @param data
     * @return
     */
    JSONObject saveOrUpdateAdresBilgileri(Map<String, String[]> data);
}
