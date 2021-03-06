package Pojo;
// Generated 11/08/2015 01:16:26 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cuenta generated by hbm2java
 */
@Entity
@Table(name="Cuenta")
public class Cuenta  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idCuenta;
     private Date ultimaConexion;
     private Date fechaCreacion;
     private String contrasena;
     private String usuario;
     private Integer tipoCuenta;
     private Integer estado;
     private Integer modo;
     
     @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="cuenta")
     private Set usuarios = new HashSet(0);

    public Cuenta() {
    }

	
    public Cuenta(Date fechaCreacion, String usuario) {
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
    }
    public Cuenta(Date ultimaConexion, Date fechaCreacion, String contrasena, String usuario, Integer tipoCuenta, Integer estado, Integer modo, Set usuarios) {
       this.ultimaConexion = ultimaConexion;
       this.fechaCreacion = fechaCreacion;
       this.contrasena = contrasena;
       this.usuario = usuario;
       this.tipoCuenta = tipoCuenta;
       this.estado = estado;
       this.modo = modo;
       this.usuarios = usuarios;
    }
   
    public Integer getIdCuenta() {
        return this.idCuenta;
    }
    
    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }
    public Date getUltimaConexion() {
        return this.ultimaConexion;
    }
    
    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Integer getTipoCuenta() {
        return this.tipoCuenta;
    }
    
    public void setTipoCuenta(Integer tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Integer getModo() {
        return this.modo;
    }
    
    public void setModo(Integer modo) {
        this.modo = modo;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


