package com.example.appmabbicaracommunity;

public class Users {
    private String indonesia;
    private String inggris;
    private String latin;
    private String jepang;

    public Users() {


    }


    public String getIndonesia() {
        return indonesia;
    }

    public void setIndonesia(String indonesia) {
        this.indonesia = indonesia;
    }

    public String getInggris() {
        return inggris;
    }
    public void setInggris(String inggris) {
        this.inggris = inggris;
    }

    public String getLatin() { return latin; }
    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getJepang() {
        return jepang;
    }
    public void setJepang(String jepang) {
        this.jepang = jepang;
    }

    public Users(String indonesia, String inggris, String latin, String jepang) {
        this.indonesia = indonesia;
        this.inggris = inggris;
        this.latin = latin;
        this.jepang = jepang;
    }
}
