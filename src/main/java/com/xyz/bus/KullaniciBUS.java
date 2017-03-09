package com.xyz.bus;

import com.xyz.dao.KullaniciDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Nurşen on 20.2.2017.
 */
@Service
@Transactional
public class KullaniciBUS implements IKullaniciBUS {
    @Autowired
    KullaniciDAO kullaniciDAO;
    @Override
    public Boolean  getKullaniciKontrol(String kullaniciAdi, String sifre) {
        Boolean  sonuc =  kullaniciDAO.getKullaniciKontrol(kullaniciAdi,sifre);
      return sonuc;
    }
}
