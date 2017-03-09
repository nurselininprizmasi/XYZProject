package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "birim", schema = "mydb", catalog = "")
public class Birim {
    private int id;
    private String birimAdi;
    private Kisi yoneticiId;
    private boolean aktif;

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
    @Column(name = "birim_adi")
    public String getBirimAdi() {
        return birimAdi;
    }

    public void setBirimAdi(String birimAdi) {
        this.birimAdi = birimAdi;
    }

    @Basic
    @Column(name = "aktif")
    public boolean getAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    @ManyToOne
    @JoinColumn(name = "yonetici_id", referencedColumnName = "id", nullable = false)
    public Kisi getYoneticiId() {
        return yoneticiId;
    }

    public void setYoneticiId(Kisi yoneticiId) {
        this.yoneticiId = yoneticiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Birim birim = (Birim) o;

        if (id != birim.id) return false;
        if (aktif != birim.aktif) return false;
        if (birimAdi != null ? !birimAdi.equals(birim.birimAdi) : birim.birimAdi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (birimAdi != null ? birimAdi.hashCode() : 0);
        return result;
    }
}
