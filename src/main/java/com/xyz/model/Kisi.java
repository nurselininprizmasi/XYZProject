package com.xyz.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "kisi", schema = "mydb", catalog = "")
public class Kisi {
    private int id;
    private String ad;
    private String soyad;
    private Date dogumTarihi;
    private int cinsiyet;
    private Integer medeniDurum;
    private int unvanId;
    private String sicilNo;
    private boolean aktif;
    private String dogumYeri;
    private String uyruk;
    private Birim birimByBirimId;

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
    @Column(name = "ad")
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Basic
    @Column(name = "soyad")
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Basic
    @Column(name = "dogum_tarihi")
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Basic
    @Column(name = "cinsiyet")
    public int getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(int cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Basic
    @Column(name = "medeni_durum")
    public Integer getMedeniDurum() {
        return medeniDurum;
    }

    public void setMedeniDurum(Integer medeniDurum) {
        this.medeniDurum = medeniDurum;
    }

    @Basic
    @Column(name = "unvan_id")
    public int getUnvanId() {
        return unvanId;
    }

    public void setUnvanId(int unvanId) {
        this.unvanId = unvanId;
    }


    @Basic
    @Column(name = "sicil_no")
    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Basic
    @Column(name = "aktif")
    public boolean getAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    @Basic
    @Column(name = "dogum_yeri")
    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    @Basic
    @Column(name = "uyruk")
    public String getUyruk() {
        return uyruk;
    }

    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kisi kisi = (Kisi) o;

        if (id != kisi.id) return false;
        if (cinsiyet != kisi.cinsiyet) return false;
        if (unvanId != kisi.unvanId) return false;
        if (aktif != kisi.aktif) return false;
        if (ad != null ? !ad.equals(kisi.ad) : kisi.ad != null) return false;
        if (soyad != null ? !soyad.equals(kisi.soyad) : kisi.soyad != null) return false;
        if (dogumTarihi != null ? !dogumTarihi.equals(kisi.dogumTarihi) : kisi.dogumTarihi != null) return false;
        if (medeniDurum != null ? !medeniDurum.equals(kisi.medeniDurum) : kisi.medeniDurum != null) return false;
        if (sicilNo != null ? !sicilNo.equals(kisi.sicilNo) : kisi.sicilNo != null) return false;
        if (dogumYeri != null ? !dogumYeri.equals(kisi.dogumYeri) : kisi.dogumYeri != null) return false;
        if (uyruk != null ? !uyruk.equals(kisi.uyruk) : kisi.uyruk != null) return false;

        return true;
    }

    @ManyToOne
    @JoinColumn(name = "birim_id", referencedColumnName = "id", nullable = false)
    public Birim getBirimByBirimId() {
        return birimByBirimId;
    }

    public void setBirimByBirimId(Birim birimByBirimId) {
        this.birimByBirimId = birimByBirimId;
    }
}
