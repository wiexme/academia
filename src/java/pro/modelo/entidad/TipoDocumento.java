package pro.modelo.entidad;
// Generated 07/06/2015 12:41:39 AM by Hibernate Tools 4.3.1



/**
 * TipoDocumento generated by hbm2java
 */
public class TipoDocumento  implements java.io.Serializable {


     private String idTipodocumento;
     private String nombre;

    public TipoDocumento() {
    }

	
    public TipoDocumento(String idTipodocumento) {
        this.idTipodocumento = idTipodocumento;
    }
    public TipoDocumento(String idTipodocumento, String nombre) {
       this.idTipodocumento = idTipodocumento;
       this.nombre = nombre;
    }
   
    public String getIdTipodocumento() {
        return this.idTipodocumento;
    }
    
    public void setIdTipodocumento(String idTipodocumento) {
        this.idTipodocumento = idTipodocumento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


