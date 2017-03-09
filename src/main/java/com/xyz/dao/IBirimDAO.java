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
public interface IBirimDAO {
    /**
     * Birimlerin listesini getirir
     * @param filter birim adına göre aramayı sağlar
     * @return
     */
    List<Map<String,Object>> getBirimler(String filter);
}
