package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "adres", schema = "mydb", catalog = "")
public class Adres {
    private int id;
    private int adresTipi;
    private Kisi kisi;
    private Konum ilId;
    private Konum ilceId;
    private String adresDetay1;
    private String adresDetay2;
    private String icKapiNo;
    private String disKapiNo;
    private Boolean aktif;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "kisi_id", referencedColumnName = "id", nullable = false)
    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    @Basic
    @Column(name = "adres_tipi")
    public int getAdresTipi() {
        return adresTipi;
    }

    public void setAdresTipi(int adresTipi) {
        this.adresTipi = adresTipi;
    }

    @ManyToOne
    @JoinColumn(name = "il_id", referencedColumnName = "id", nullable = false)
    public Konum getIlId() {
        return ilId;
    }

    public void setIlId(Konum ilId) {
        this.ilId = ilId;
    }

    @ManyToOne
    @JoinColumn(name = "ilce_id", referencedColumnName = "id", nullable = false)
    public Konum getIlceId() {
        return ilceId;
    }

    public void setIlceId(Konum ilceId) {
        this.ilceId = ilceId;
    }
    @Basic
    @Column(name = "adres_detay1")
    public String getAdresDetay1() {
        return adresDetay1;
    }

    public void setAdresDetay1(String adresDetay1) {
        this.adresDetay1 = adresDetay1;
    }

    @Basic
    @Column(name = "adres_detay2")
    public String getAdresDetay2() {
        return adresDetay2;
    }

    public void setAdresDetay2(String adresDetay2) {
        this.adresDetay2 = adresDetay2;
    }

    @Basic
    @Column(name = "ic_kapi_no")
    public String getIcKapiNo() {
        return icKapiNo;
    }

    public void setIcKapiNo(String icKapiNo) {
        this.icKapiNo = icKapiNo;
    }

    @Basic
    @Column(name = "dis_kapi_no")
    public String getDisKapiNo() {
        return disKapiNo;
    }

    public void setDisKapiNo(String disKapiNo) {
        this.disKapiNo = disKapiNo;
    }

    @Basic
    @Column(name = "aktif")
    public boolean getAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adres adres = (Adres) o;

        if (id != adres.id) return false;
        if (adresTipi != adres.adresTipi) return false;
        if (adresDetay1 != null ? !adresDetay1.equals(adres.adresDetay1) : adres.adresDetay1 != null) return false;
        if (adresDetay2 != null ? !adresDetay2.equals(adres.adresDetay2) : adres.adresDetay2 != null) return false;
        if (icKapiNo != null ? !icKapiNo.equals(adres.icKapiNo) : adres.icKapiNo != null) return false;
        if (disKapiNo != null ? !disKapiNo.equals(adres.disKapiNo) : adres.disKapiNo != null) return false;
        if (aktif != null ? !aktif.equals(adres.aktif) : adres.aktif != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + adresTipi;
        result = 31 * result + (adresDetay1 != null ? adresDetay1.hashCode() : 0);
        result = 31 * result + (adresDetay2 != null ? adresDetay2.hashCode() : 0);
        result = 31 * result + (icKapiNo != null ? icKapiNo.hashCode() : 0);
        result = 31 * result + (disKapiNo != null ? disKapiNo.hashCode() : 0);
        result = 31 * result + (aktif != null ? aktif.hashCode() : 0);
        return result;
    }
}
