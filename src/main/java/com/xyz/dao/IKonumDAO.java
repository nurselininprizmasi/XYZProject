package com.xyz.dao;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 3.03.2017.
 */
@Repository
@Transactional
public interface IKonumDAO {
    /**
     * İllerin listesini getirir
     * @param filter
     * @return
     */
    List<Map<String,Object>> getIller(String filter);

    /**
     * İlçelerin listesini getirir
     *
     * @param ilId ilçenin bağlı olduğu il_id bilgisini içerir
     * @param filter ilçe adına göre arama yapmayı sağlar
     * @return
     */
    List<Map<String,Object>> getIlcelerByIlId(String ilId, String filter);
}
