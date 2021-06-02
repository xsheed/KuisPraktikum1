/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

import kuis.PesertaTes;

/**
 *
 * @author xShido
 */
public class Android extends PesertaTes implements Seleksi{
    public Android(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        super(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }

    public void setNilaiTulis(int nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public void setNilaiCoding(int nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public void setNilaiWawancara(int nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }

    @Override
    public double nilai() {
        return (super.nilaiTulis * 0.2) + (super.nilaiCoding * 0.5) + (super.nilaiWawancara * 0.3);
    }

    @Override
    public String keterangan() {
        if(this.nilai() >= 85) return "LULUS\nSelamat kepada " + this.nama + " telah diterima sebagai Android Developer di Tokopaedi";
        else return "GAGAL\nMohon maaf kepada " + this.nama + " belum dapat menjadi Android developer di Tokopaedi";
    }
}
