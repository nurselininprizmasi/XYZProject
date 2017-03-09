package com.xyz.controller;

import com.xyz.bus.IKullaniciBUS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Nurşen on 20.2.2017.
 */
@RestController
@Controller
@RequestMapping("/kullanici")
public class KullaniciController {
    @Autowired
    IKullaniciBUS kullaniciBUS;

    @RequestMapping("/kullaniciKontrol.ajax")
    public Boolean kullaniciKontrol(HttpServletRequest request, HttpServletResponse response){
        String kullaniciAdi = request.getParameter("kullaniciAdi");
        String sifre = request.getParameter("sifre");

        return kullaniciBUS.getKullaniciKontrol(kullaniciAdi,sifre);

    }


}
