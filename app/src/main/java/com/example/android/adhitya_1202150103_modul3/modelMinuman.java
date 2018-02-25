package com.example.android.adhitya_1202150103_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by Tavs on 25/02/2018.
 */

public class modelMinuman {
    private String nama_merk;
    private String info;
    private String deskripsi;
    private int gambar;

    public modelMinuman(String nama_merk, String info, String deskripsi, int gambar) {
        this.nama_merk = nama_merk;
        this.info = info;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public static Intent toClick(Context context, String title, String desc, @DrawableRes int img){
        Intent io = new Intent(context,MenuDetail.class);
        io.putExtra("EXTRA_TITLE", title);
        io.putExtra("EXTRA_DESC", desc);
        io.putExtra("EXTRA_IMG", img);
        return io;
    }


    public String getNama_merk() {
        return nama_merk;
    }

    public void setNama_merk(String nama_merk) {
        this.nama_merk = nama_merk;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }





}
