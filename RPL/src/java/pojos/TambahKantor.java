package pojos;
// Generated Nov 26, 2018 5:34:51 PM by Hibernate Tools 4.3.1



/**
 * TambahKantor generated by hbm2java
 */
public class TambahKantor  implements java.io.Serializable {


     private String idKantor;
     private String jenis;
     private String tableRouting;

    public TambahKantor() {
    }

	
    public TambahKantor(String idKantor) {
        this.idKantor = idKantor;
    }
    public TambahKantor(String idKantor, String jenis, String tableRouting) {
       this.idKantor = idKantor;
       this.jenis = jenis;
       this.tableRouting = tableRouting;
    }
   
    public String getIdKantor() {
        return this.idKantor;
    }
    
    public void setIdKantor(String idKantor) {
        this.idKantor = idKantor;
    }
    public String getJenis() {
        return this.jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getTableRouting() {
        return this.tableRouting;
    }
    
    public void setTableRouting(String tableRouting) {
        this.tableRouting = tableRouting;
    }




}

