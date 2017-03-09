package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "kullanici_rol", schema = "mydb", catalog = "")
public class KullaniciRol {
    private int id;
    private byte aktif;
    private Kullanici kullaniciByKullaniciId;

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

        KullaniciRol that = (KullaniciRol) o;

        if (id != that.id) return false;
        if (aktif != that.aktif) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) aktif;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "kullanici_id", referencedColumnName = "id", nullable = false)
    public Kullanici getKullaniciByKullaniciId() {
        return kullaniciByKullaniciId;
    }

    public void setKullaniciByKullaniciId(Kullanici kullaniciByKullaniciId) {
        this.kullaniciByKullaniciId = kullaniciByKullaniciId;
    }
}
