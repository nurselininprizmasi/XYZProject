package com.xyz.controller;

import com.xyz.bus.ITanimBUS;
import net.sf.json.JSONObject;
import org.json.JSONException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Nursen on 26.02.2017.
 */
@RestController
@Controller
@RequestMapping("/tanim")
public class TanimController {
    @Autowired
    ITanimBUS tanimBUS;

    @RequestMapping("/getTanimlarByUstTanimId.ajax")
    public JSONObject getTanimlarByUstTanimId(HttpServletRequest request, HttpServletResponse response) throws JSONException {

        Integer ustTanimId = Integer.parseInt(request.getParameter("ustTanimId"));
        String filter = request.getParameter("query");
        List<Map<String,Object>> list = tanimBUS.getTanimlarByUstTanimId(ustTanimId,filter);
        JSONObject json = new JSONObject();
        json.put("data",list);
        json.put("success",true);
        json.put("totalCount",list.size());
        return json;

    }
    @RequestMapping("/getBirimler.ajax")
    public JSONObject getBirimler(HttpServletRequest request, HttpServletResponse response) throws JSONException {

        String filter = request.getParameter("query");
        List<Map<String,Object>> list = tanimBUS.getBirimler(filter);
        JSONObject json = new JSONObject();
        json.put("data",list);
        json.put("success",true);
        json.put("totalCount",list.size());
        return json;

    }
    @RequestMapping("/getIller.ajax")
    public JSONObject getIller(HttpServletRequest request, HttpServletResponse response) throws JSONException {
        String filter = request.getParameter("query");
        List<Map<String,Object>> listIller = tanimBUS.getIller(filter);
        JSONObject json = new JSONObject();
        json.put("data",listIller);
        json.put("success",true);
        json.put("totalCount",listIller.size());
        return json;

    }
    @RequestMapping("/getIlcelerByIlId.ajax")
    public JSONObject getIlcelerByIlId(HttpServletRequest request, HttpServletResponse response) throws JSONException {
        String filter = request.getParameter("query");
        String ilId = request.getParameter("ilId");
        List<Map<String,Object>> listIlceler = tanimBUS.getIlcelerByIlId(ilId,filter);
        JSONObject json = new JSONObject();
        json.put("data",listIlceler);
        json.put("success",true);
        json.put("totalCount",listIlceler.size());
        return json;

    }

}
