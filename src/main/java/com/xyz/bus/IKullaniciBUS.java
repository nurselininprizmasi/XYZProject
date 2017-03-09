package com.xyz.bus;

/**
 * Created by Nursen on 23.02.2017.
 */
public interface IKullaniciBUS  {
    /**
     * Kullanıcı Adı ve Şifresinin kontrolünü yapan metod
     * @param kullaniciAdi String olarak kullanıcı adi bilgisini içerir
     * @param sifre String olarak şifre bilgisini içerir
     * @return kullanıcı adı ve şifre doğru ise true döner
     */
    Boolean getKullaniciKontrol(String kullaniciAdi, String sifre);
}
