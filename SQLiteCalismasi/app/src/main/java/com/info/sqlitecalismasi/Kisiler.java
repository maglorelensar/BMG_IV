package com.info.sqlitecalismasi;

/**
 * Created by kasimadalan on 16.01.2017.
 */

public class Kisiler {
    private int kisi_no;
    private String kisi_ad;
    private String kisi_tel;
    private int kisi_yas;
    private double kisi_boy;

    public Kisiler() {
    }

    public Kisiler(int kisi_no, String kisi_ad, String kisi_tel, int kisi_yas, double kisi_boy) {
        this.kisi_no = kisi_no;
        this.kisi_ad = kisi_ad;
        this.kisi_tel = kisi_tel;
        this.kisi_yas = kisi_yas;
        this.kisi_boy = kisi_boy;
    }

    public int getKisi_no() {
        return kisi_no;
    }

    public void setKisi_no(int kisi_no) {
        this.kisi_no = kisi_no;
    }

    public String getKisi_ad() {
        return kisi_ad;
    }

    public void setKisi_ad(String kisi_ad) {
        this.kisi_ad = kisi_ad;
    }

    public String getKisi_tel() {
        return kisi_tel;
    }

    public void setKisi_tel(String kisi_tel) {
        this.kisi_tel = kisi_tel;
    }

    public int getKisi_yas() {
        return kisi_yas;
    }

    public void setKisi_yas(int kisi_yas) {
        this.kisi_yas = kisi_yas;
    }

    public double getKisi_boy() {
        return kisi_boy;
    }

    public void setKisi_boy(double kisi_boy) {
        this.kisi_boy = kisi_boy;
    }
}
