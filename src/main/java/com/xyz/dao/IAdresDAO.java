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
public interface IAdresDAO {
    List<Map<String, Object>> getAdresBilgileriByKisiId(Integer i);

    List<Map<String,Object>> getAdresBilgileriById(Integer adresId);
}
