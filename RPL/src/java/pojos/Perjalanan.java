package pojos;
// Generated 29-Nov-2018 04:16:50 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Perjalanan generated by hbm2java
 */
public class Perjalanan  implements java.io.Serializable {


     private Integer idPerjalanan;
     private int idBarang;
     private String idAsal;
     private String idTujuan;
     private String waktuDiterima;
     private Date tanggalDiterima;
     private String namaPenerima;

    public Perjalanan() {
    }

	
    public Perjalanan(int idBarang, String idAsal, String idTujuan, String waktuDiterima, Date tanggalDiterima) {
        this.idBarang = idBarang;
        this.idAsal = idAsal;
        this.idTujuan = idTujuan;
        this.waktuDiterima = waktuDiterima;
        this.tanggalDiterima = tanggalDiterima;
    }
    public Perjalanan(int idBarang, String idAsal, String idTujuan, String waktuDiterima, Date tanggalDiterima, String namaPenerima) {
       this.idBarang = idBarang;
       this.idAsal = idAsal;
       this.idTujuan = idTujuan;
       this.waktuDiterima = waktuDiterima;
       this.tanggalDiterima = tanggalDiterima;
       this.namaPenerima = namaPenerima;
    }
   
    public Integer getIdPerjalanan() {
        return this.idPerjalanan;
    }
    
    public void setIdPerjalanan(Integer idPerjalanan) {
        this.idPerjalanan = idPerjalanan;
    }
    public int getIdBarang() {
        return this.idBarang;
    }
    
    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }
    public String getIdAsal() {
        return this.idAsal;
    }
    
    public void setIdAsal(String idAsal) {
        this.idAsal = idAsal;
    }
    public String getIdTujuan() {
        return this.idTujuan;
    }
    
    public void setIdTujuan(String idTujuan) {
        this.idTujuan = idTujuan;
    }
    public String getWaktuDiterima() {
        return this.waktuDiterima;
    }
    
    public void setWaktuDiterima(String waktuDiterima) {
        this.waktuDiterima = waktuDiterima;
    }
    public Date getTanggalDiterima() {
        return this.tanggalDiterima;
    }
    
    public void setTanggalDiterima(Date tanggalDiterima) {
        this.tanggalDiterima = tanggalDiterima;
    }
    public String getNamaPenerima() {
        return this.namaPenerima;
    }
    
    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }




}


