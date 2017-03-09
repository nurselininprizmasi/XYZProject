package com.xyz.bus;

import com.xyz.dao.IBirimDAO;
import com.xyz.dao.IKonumDAO;
import com.xyz.dao.ITanimDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 26.02.2017.
 */
@Service
@Transactional
public class TanimBUS implements ITanimBUS{
    @Autowired
    ITanimDAO tanimDAO;

    @Autowired
    IBirimDAO birimDAO;

    @Autowired
    IKonumDAO konumDAO;


    @Override
    public List<Map<String, Object>> getTanimlarByUstTanimId(Integer ustTanimId, String filter) {
        if(ustTanimId!=null){
           return tanimDAO.getTanimlarByUstTanimId(ustTanimId,filter);
        }else{
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> getBirimler(String filter) {
        List<Map<String, Object>> listBirim = birimDAO.getBirimler(filter);
        return listBirim;
    }

    @Override
    public List<Map<String, Object>> getIller(String filter) {
        List<Map<String, Object>> listIl = konumDAO.getIller(filter);
        return listIl;
    }

    @Override
    public List<Map<String, Object>> getIlcelerByIlId(String ilId, String filter) {
        List<Map<String, Object>> listIlce = konumDAO.getIlcelerByIlId(ilId,filter);
        return listIlce;
    }


}
