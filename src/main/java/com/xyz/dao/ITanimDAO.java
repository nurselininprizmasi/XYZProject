package com.xyz.dao;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 26.02.2017.
 */
@Repository
@Transactional
public interface ITanimDAO {

    List<Map<String,Object>> getTanimlarByUstTanimId(Integer ustTanimId, String filter);

}
