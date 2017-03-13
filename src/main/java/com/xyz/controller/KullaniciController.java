package com.xyz.controller;

import com.xyz.bus.IKullaniciBUS;
import net.sf.json.JSONObject;
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
    public JSONObject kullaniciKontrol(HttpServletRequest request, HttpServletResponse response){
        JSONObject json = new JSONObject();
        String kullaniciAdi = request.getParameter("kullaniciAdi");
        String sifre = request.getParameter("sifre");
        json.put("success",kullaniciBUS.getKullaniciKontrol(kullaniciAdi,sifre));
        return json;

    }


}
