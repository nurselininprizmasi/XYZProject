package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "konum", schema = "mydb", catalog = "")
public class Konum {
    private int id;
    private Integer ustKonumId;
    private String aciklama;

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
    @Column(name = "ust_konum_id")
    public Integer getUstKonumId() {
        return ustKonumId;
    }

    public void setUstKonumId(Integer ustKonumId) {
        this.ustKonumId = ustKonumId;
    }

    @Basic
    @Column(name = "aciklama")
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Konum konum = (Konum) o;

        if (id != konum.id) return false;
        if (ustKonumId != null ? !ustKonumId.equals(konum.ustKonumId) : konum.ustKonumId != null) return false;
        if (aciklama != null ? !aciklama.equals(konum.aciklama) : konum.aciklama != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ustKonumId != null ? ustKonumId.hashCode() : 0);
        result = 31 * result + (aciklama != null ? aciklama.hashCode() : 0);
        return result;
    }
}
