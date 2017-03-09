package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "tanim", schema = "mydb", catalog = "")
public class Tanim {
    private int id;
    private int ustTanimId;
    private String aciklama;
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
    @Column(name = "ust_tanim_id")
    public int getUstTanimId() {
        return ustTanimId;
    }

    public void setUstTanimId(int ustTanimId) {
        this.ustTanimId = ustTanimId;
    }

    @Basic
    @Column(name = "aciklama")
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
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

        Tanim tanim = (Tanim) o;

        if (id != tanim.id) return false;
        if (ustTanimId != tanim.ustTanimId) return false;
        if (aktif != tanim.aktif) return false;
        if (aciklama != null ? !aciklama.equals(tanim.aciklama) : tanim.aciklama != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + ustTanimId;
        result = 31 * result + (aciklama != null ? aciklama.hashCode() : 0);
        return result;
    }
}
