package com.xyz.bus;

import net.sf.json.JSONObject;

import java.util.Map;

/**
 * Created by Nursen on 9.03.2017.
 */
public interface IBirimBUS {
    /**
     * Birime Yönetici atama işlemi için kullanılır
     * @param data parametreleri içerir
     * @return
     */
    JSONObject birimYoneticiAta(Map<String, String[]> data);
}
