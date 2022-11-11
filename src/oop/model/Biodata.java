/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.model;

/**
 *
 * @author hp
 */

public class Biodata {
String nama, kls, jk, jrs, almt;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKls() {
        return kls;
    }

    public void setKls(String kls) {
        this.kls = kls;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getJrs() {
        return jrs;
    }

    public void setJrs(String jrs) {
        this.jrs = jrs;
    }

    public String getAlmt() {
        return almt;
    }

    public void setAlmt(String almt) {
        this.almt = almt;
    }

    public Biodata(String nama, String kls, String jk, String jrs, String almt) {
        this.nama = nama;
        this.kls = kls;
        this.jk = jk;
        this.jrs = jrs;
        this.almt = almt;
    }



}
