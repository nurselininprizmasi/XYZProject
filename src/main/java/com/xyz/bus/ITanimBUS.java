package com.xyz.bus;

import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 26.02.2017.
 */
public interface ITanimBUS {
    /**
     * Gelen ustTanimId bilgisine göre sonuçları getirir
     * @param ustTanimId ustTanimId bilgisini içerir
     * @param filter arama yapmak için kullanılır
     * @return
     */
    List<Map<String,Object>> getTanimlarByUstTanimId(Integer ustTanimId, String filter);

    /**
     * Kayıtlı birimleri getirir
     * @param filter arama yapmak için kullanılır
     * @return
     */
    List<Map<String,Object>> getBirimler(String filter);

    /**
     * Tanımlı il bilgisini getirir
     * @param filter
     * @return
     */
    List<Map<String,Object>> getIller(String filter);

    /**
     *
     * Seçili il_id ye göre ilçe tanımlarını getirir
     * @param ilId il_id bilgisini içerir
     * @param filter içle için arama yapmayı sağlar
     * @return
     */
    List<Map<String,Object>> getIlcelerByIlId(String ilId, String filter);
}
