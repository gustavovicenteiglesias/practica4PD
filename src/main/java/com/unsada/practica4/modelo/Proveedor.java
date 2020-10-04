package com.unsada.practica4.modelo;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_proveedor")
    private Long idProveedor;
   
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name="cuit")
    private Long cuit;
   
    @Column(name = "contacto")
    private String contacto;
    @Column(name = "telefono")
    private Integer telefono;
    
    @Column(name = "email")
    private String email;
   
  

	@Column(name = "calle")
    private String calle;
    
    @Column(name = "numero")
    private Integer numero;
   
    @Column(name = "localidad")
    private String localidad;
   
    @Column(name = "provincia")
    private String provincia;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private Collection<Articulo> ArticuloCollection;

	public Proveedor(Long idProveedor, String nombre, Long cuit, String contacto, Integer telefono, String email,
			String calle, Integer numero, String localidad, String provincia) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.cuit = cuit;
		this.contacto = contacto;
		this.telefono = telefono;
		this.email = email;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Proveedor() {
		super();
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + "]";
	}
    
   

	
	

	
    
    
}
