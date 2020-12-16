package com.example.DtoExample.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adres;
    @Enumerated(EnumType.STRING)
    private AdresTip adresTip;
    private Boolean aktif;

    @ManyToOne
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;

    enum AdresTip{
        EV_ADRESİ,
        IS_ADRESİ,
        DIGER
    }


    public Adres() {
    }

    public Adres(Long id, String adres, AdresTip adresTip, Boolean aktif) {
        this.id = id;
        this.adres = adres;
        this.adresTip = adresTip;
        this.aktif = aktif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public AdresTip getAdresTip() {
        return adresTip;
    }

    public void setAdresTip(AdresTip adresTip) {
        this.adresTip = adresTip;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }


}
