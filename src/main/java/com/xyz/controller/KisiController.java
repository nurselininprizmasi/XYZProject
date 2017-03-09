package com.xyz.controller;

import com.xyz.bus.IBirimBUS;
import com.xyz.bus.IKisiBUS;
import com.xyz.model.Kisi;
import com.xyz.utils.Util;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 25.02.2017.
 */
@RestController
@Controller
@RequestMapping("/kisi")
public class KisiController {

    @Autowired
    IKisiBUS kisiBUS;

    @Autowired
    IBirimBUS birimBUS;

    @RequestMapping("/getKisiler.ajax")
    public Map<String, Object> getKisiler(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> list = new HashMap<>();
        Map<String, Object[]> parameterMap1 = Util.getQueryParameters(request);
        List<Kisi> l = kisiBUS.getKisiler(parameterMap1);

        list.put("data", l);
        return list;
    }

    @RequestMapping("/saveOrUpdateKisi.ajax")
    public JSONObject saveOrUpdateKisi(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        Map<String, String[]> data = request.getParameterMap();
        JSONObject json = kisiBUS.saveOrUpdateKisi(data);

        return json;
    }

    @RequestMapping("/getAdresBilgileriByKisiId.ajax")
    public JSONObject getAdresBilgileriByKisiId(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        String kisiId = request.getParameter("kisiId");
        JSONObject json = kisiBUS.getAdresBilgileriByKisiId(kisiId);

        return json;
    }

    @RequestMapping("/getAdresBilgileriById.ajax")
    public List<Map<String, Object>> getAdresBilgileriById(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        String adresId = request.getParameter("adresId");
        List<Map<String, Object>> list = kisiBUS.getAdresBilgileriById(adresId);

        return list;
    }

    @RequestMapping("/removeAdresBilgisiByAdresId.ajax")
    public JSONObject removeAdresBilgisiByAdresId(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        String adresId = request.getParameter("adresId");
        JSONObject json = kisiBUS.removeAdresBilgisiByAdresId(adresId);

        return json;
    }

    @RequestMapping("/saveOrUpdateAdresBilgileri.ajax")
    public JSONObject saveOrUpdateAdresBilgileri(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        Map<String, String[]> data = request.getParameterMap();
        JSONObject json = kisiBUS.saveOrUpdateAdresBilgileri(data);

        return json;
    }
    @RequestMapping("/birimYoneticiAta.ajax")
    public JSONObject birimYoneticiAta(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        Map<String, String[]> data = request.getParameterMap();
        JSONObject json = birimBUS.birimYoneticiAta(data);

        return json;
    }
}
