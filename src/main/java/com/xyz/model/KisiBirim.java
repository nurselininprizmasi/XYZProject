package com.xyz.model;

import javax.persistence.*;

/**
 * Created by Nursen on 25.02.2017.
 */
@Entity
@Table(name = "kisi_birim", schema = "mydb", catalog = "")
public class KisiBirim {
    private int id;
    private byte aktif;
    private Kisi kisiByKisiId;
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

        KisiBirim kisiBirim = (KisiBirim) o;

        if (id != kisiBirim.id) return false;
        if (aktif != kisiBirim.aktif) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) aktif;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "kisi_id", referencedColumnName = "id", nullable = false)
    public Kisi getKisiByKisiId() {
        return kisiByKisiId;
    }

    public void setKisiByKisiId(Kisi kisiByKisiId) {
        this.kisiByKisiId = kisiByKisiId;
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
