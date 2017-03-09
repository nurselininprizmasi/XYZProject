package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "rol", schema = "mydb", catalog = "")
public class Rol {
    private int id;
    private String aciklama;
    private Byte aktif;

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
    @Column(name = "aciklama")
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Basic
    @Column(name = "aktif")
    public Byte getAktif() {
        return aktif;
    }

    public void setAktif(Byte aktif) {
        this.aktif = aktif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rol rol = (Rol) o;

        if (id != rol.id) return false;
        if (aciklama != null ? !aciklama.equals(rol.aciklama) : rol.aciklama != null) return false;
        if (aktif != null ? !aktif.equals(rol.aktif) : rol.aktif != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (aciklama != null ? aciklama.hashCode() : 0);
        result = 31 * result + (aktif != null ? aktif.hashCode() : 0);
        return result;
    }
}
