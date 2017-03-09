package com.xyz.bus;

import com.xyz.dao.IBirimDAO;
import com.xyz.model.Birim;
import com.xyz.model.Kisi;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;

/**
 * Created by Nursen on 9.03.2017.
 */
@Service
@Transactional
public class BirimBUS implements IBirimBUS {
    @Autowired
    IBirimDAO birimDAO;

    @Autowired
    IBirimRepository birimRepository;

    @Autowired
    IKisiRepository kisiRepository;

    @Override
    public JSONObject birimYoneticiAta(Map<String, String[]> data) {
        JSONObject json = JSONObject.fromObject(data.get("data")[0]);
        Integer kisiId = json.getInt("kisiId");
        Integer birimId = json.getInt("birimId");

        Kisi kisi = kisiRepository.getOne(kisiId);
        Birim birim = birimRepository.getOne(birimId);

        birim.setYoneticiId(kisi);
        birimRepository.saveAndFlush(birim);

        JSONObject json2 = new JSONObject();
        json2.put("success",true);
        return json2;
    }
}
