/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author xShido
 */
public class PesertaTes {
    protected String nik, nama;
    protected int nilaiTulis, nilaiCoding, nilaiWawancara;
    public PesertaTes(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        this.nik = nik;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
}
