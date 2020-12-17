package com.example.DtoExample.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kisi")
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String adi;
    @Column(length = 100)
    private String soyadi;

    @OneToMany(
            mappedBy = "kisi",
            cascade = CascadeType.ALL
    )
    private List<Araba> araba;


    public Kisi() {
    }

    public Kisi(Long id, String adi, String soyadi,List<Araba> araba) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.araba = araba;

    }

    public List<Araba> getAraba() {
        return araba;
    }

    public void setAraba(List<Araba> araba) {
        this.araba = araba;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

}
