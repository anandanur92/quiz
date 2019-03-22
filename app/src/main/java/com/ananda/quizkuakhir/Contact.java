package com.ananda.quizkuakhir;

public class Contact {

    private String nama;
    private String nohp;
    private String alamat;
    private String JK;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Contact(String nama, String nohp, String alamat, String JK) {
        this.nama = nama;
        this.nohp = nohp;
        this.alamat = alamat;
        this.JK = JK;
    }

    public Contact(String nama, String nohp, String alamat) {
        this.nama = nama;
        this.nohp = nohp;
        this.alamat = alamat;
    }

    public Contact(String nama, String nohp) {
        this.nama = nama;
        this.nohp = nohp;
    }
    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }
}

