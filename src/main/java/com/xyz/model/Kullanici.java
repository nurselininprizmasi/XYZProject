package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "kullanici", schema = "mydb", catalog = "")
public class Kullanici {
    private int id;
    private String adi;
    private String soyadi;
    private String kullaniciAdi;
    private String sifre;
    private byte aktif;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "adi")
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Basic
    @Column(name = "soyadi")
    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Basic
    @Column(name = "kullanici_adi")
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    @Basic
    @Column(name = "sifre")
    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Basic
    @Column(name = "aktif")
    public byte getAktif() {
        return aktif;
    }

    public void setAktif(byte aktif) {
        this.aktif = aktif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kullanici kullanici = (Kullanici) o;

        if (id != kullanici.id) return false;
        if (aktif != kullanici.aktif) return false;
        if (adi != null ? !adi.equals(kullanici.adi) : kullanici.adi != null) return false;
        if (soyadi != null ? !soyadi.equals(kullanici.soyadi) : kullanici.soyadi != null) return false;
        if (kullaniciAdi != null ? !kullaniciAdi.equals(kullanici.kullaniciAdi) : kullanici.kullaniciAdi != null)
            return false;
        if (sifre != null ? !sifre.equals(kullanici.sifre) : kullanici.sifre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (adi != null ? adi.hashCode() : 0);
        result = 31 * result + (soyadi != null ? soyadi.hashCode() : 0);
        result = 31 * result + (kullaniciAdi != null ? kullaniciAdi.hashCode() : 0);
        result = 31 * result + (sifre != null ? sifre.hashCode() : 0);
        result = 31 * result + (int) aktif;
        return result;
    }
}
