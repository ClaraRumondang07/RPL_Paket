package pojos;
// Generated 06-Nov-2018 16:34:08 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TabelKirimBarang generated by hbm2java
 */
public class TabelKirimBarang  implements java.io.Serializable {


     private Integer idbarang;
     private TabelStokGudang tabelStokGudang;
     private TabelToko tabelToko;
     private String namaBarang;
     private int jumlahBarang;
     private Date tanggal;
     private Set tabelStokBarangTokos = new HashSet(0);

    public TabelKirimBarang() {
    }

	
    public TabelKirimBarang(String namaBarang, int jumlahBarang, Date tanggal) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.tanggal = tanggal;
    }
    public TabelKirimBarang(TabelStokGudang tabelStokGudang, TabelToko tabelToko, String namaBarang, int jumlahBarang, Date tanggal, Set tabelStokBarangTokos) {
       this.tabelStokGudang = tabelStokGudang;
       this.tabelToko = tabelToko;
       this.namaBarang = namaBarang;
       this.jumlahBarang = jumlahBarang;
       this.tanggal = tanggal;
       this.tabelStokBarangTokos = tabelStokBarangTokos;
    }
   
    public Integer getIdbarang() {
        return this.idbarang;
    }
    
    public void setIdbarang(Integer idbarang) {
        this.idbarang = idbarang;
    }
    public TabelStokGudang getTabelStokGudang() {
        return this.tabelStokGudang;
    }
    
    public void setTabelStokGudang(TabelStokGudang tabelStokGudang) {
        this.tabelStokGudang = tabelStokGudang;
    }
    public TabelToko getTabelToko() {
        return this.tabelToko;
    }
    
    public void setTabelToko(TabelToko tabelToko) {
        this.tabelToko = tabelToko;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }
    
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getJumlahBarang() {
        return this.jumlahBarang;
    }
    
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    public Date getTanggal() {
        return this.tanggal;
    }
    
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public Set getTabelStokBarangTokos() {
        return this.tabelStokBarangTokos;
    }
    
    public void setTabelStokBarangTokos(Set tabelStokBarangTokos) {
        this.tabelStokBarangTokos = tabelStokBarangTokos;
    }




}


