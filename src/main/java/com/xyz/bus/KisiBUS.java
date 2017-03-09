package com.xyz.bus;

import com.xyz.dao.IAdresDAO;
import com.xyz.dao.IKisiDAO;
import com.xyz.model.Adres;
import com.xyz.model.Birim;
import com.xyz.model.Kisi;
import com.xyz.model.Konum;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.xyz.utils.Util.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Service
@Transactional
public class KisiBUS implements IKisiBUS {
    @Autowired
    IKisiDAO kisiDAO;

    @Autowired
    IKisiRepository kisiRepository;

    @Autowired
    IBirimRepository birimRepository;

    @Autowired
    IAdresDAO adresDAO;

    @Autowired
    IAdresRepository adresRepository;

    @Autowired
    IKonumRepository konumRepository;

    @Override
    public List<Kisi> getKisiler(Map<String, Object[]> parameterMap) {

        String ad = requestGet(parameterMap.get("ad"));
        String soyAd = requestGet(parameterMap.get("soyad"));
        String birimId = requestGet(parameterMap.get("birim"));
        return kisiDAO.getKisiler(ad, soyAd, birimId);
    }

    @Override
    public JSONObject saveOrUpdateKisi(Map<String, String[]> data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        JSONObject json = JSONObject.fromObject(data.get("data")[0]);
        String id = json.getString("ID");

        Integer kisiId = null;
        if (id != null && !id.equals("")) {
            kisiId = Integer.parseInt(json.getString("ID"));
        }
        String ad = json.getString("ad");
        String soyAd = json.getString("soyad");
        Date dogumTarihi = format.parse(json.getString("dogum_tarihi"));
        String dogumYeri = json.getString("dogum_yeri");
        Integer cinsiyet = json.getInt("cinsiyet");
        Integer medeniDurum = Integer.parseInt(json.getString("medeni_durum"));
        Integer unvanId = Integer.parseInt(json.getString("unvan_id"));
        String sicilNo = json.getString("sicil_no");
        String uyruk = json.getString("uyruk");
        Integer birimId = Integer.parseInt(json.getString("birim_id"));
        Boolean aktif = json.getBoolean("aktif");

        Birim birim = birimRepository.findOne(birimId);


        Kisi kisi = null;
        if (kisiId == null) {
            kisi = new Kisi();
        } else {
            kisi = kisiRepository.findOne(kisiId);
        }
        kisi.setAd(ad);
        kisi.setSoyad(soyAd);
        kisi.setDogumTarihi(dogumTarihi);
        kisi.setDogumYeri(dogumYeri);
        kisi.setCinsiyet(cinsiyet);
        kisi.setMedeniDurum(medeniDurum);
        kisi.setUnvanId(unvanId);
        kisi.setSicilNo(sicilNo);
        kisi.setUyruk(uyruk);
        kisi.setBirimByBirimId(birim);
        kisi.setAktif(aktif);

        kisiRepository.saveAndFlush(kisi);
        json.put("success", true);
        return json;
    }

    @Override
    public JSONObject getAdresBilgileriByKisiId(String kisiId) {
        JSONObject json = new JSONObject();
        List<Map<String, Object>> listAdres = adresDAO.getAdresBilgileriByKisiId(Integer.parseInt(kisiId));
        json.put("data", listAdres);
        json.put("success", true);
        json.put("totalCount", listAdres.size());
        return json;

    }

    @Override
    public List<Map<String, Object>> getAdresBilgileriById(String adresId) {
        JSONObject json = new JSONObject();
        List<Map<String, Object>> listAdres = adresDAO.getAdresBilgileriById(Integer.parseInt(adresId));
        json.put("data", listAdres);
        json.put("totalCount", listAdres.size());
        json.put("success", true);
        return listAdres;
    }

    @Override
    public JSONObject removeAdresBilgisiByAdresId(String adresId) {
        JSONObject json = new JSONObject();
        Integer id = Integer.parseInt(adresId);

        Adres adres = adresRepository.findOne(id);

        adres.setAktif(false);

        adresRepository.saveAndFlush(adres);
        json.put("success", true);
        return json;

    }

    @Override
    public JSONObject saveOrUpdateAdresBilgileri(Map<String, String[]> data) {
        JSONObject json = JSONObject.fromObject(data.get("data")[0]);
        Integer adresId = (json.get("id").equals("") ? null : json.getInt("id"));
        Integer kisiId = Integer.parseInt(data.get("kisiId")[0]);
        Integer adresTipi = json.getInt("adres_tipi");
        Integer ilId = json.getInt("il_id");
        Integer ilceId = json.getInt("ilce_id");
        String adresDetay1 = json.getString("adres_detay1");
        String adresDetay2 = json.getString("adres_detay2");
        String icKapiNo = json.getString("ic_kapi_no");
        String disKapiNo = json.getString("dis_kapi_no");

        Adres adres = null;

        if (adresId != null) {
            adres = adresRepository.getOne(adresId);
        } else {

            Adres kisiAdres = kisiDAO.getKisiAdresler(kisiId, adresTipi);
            //Aynı adres tipinden kayıt varsa
            if (kisiAdres != null) {
                adres = kisiAdres;
            } else {
                adres = new Adres();
            }
        }
        Kisi kisi = kisiRepository.getOne(kisiId);
        Konum konum1 = konumRepository.getOne(ilId);
        Konum konum2 = konumRepository.getOne(ilceId);
        adres.setKisi(kisi);
        adres.setAdresTipi(adresTipi);
        adres.setIlId(konum1);
        adres.setIlceId(konum2);
        adres.setAdresDetay1(adresDetay1);
        adres.setAdresDetay2(adresDetay2);
        adres.setIcKapiNo(icKapiNo);
        adres.setDisKapiNo(disKapiNo);
        adres.setAktif(true);

        adresRepository.saveAndFlush(adres);
        JSONObject json2 = new JSONObject();
        json2.put("success", true);
        json2.put("message", "Kayıt işlemi başarılı");

        return json2;
    }

}
