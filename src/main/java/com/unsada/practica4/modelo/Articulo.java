package com.unsada.practica4.modelo;

import java.io.Serializable;


import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;


@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_articulo")
    private Long idArticulo;
   
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name="precio")
    private Integer cuit;
   
    @Column(name = "descripcion")
    private String descripcion;
    
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = false)
    private Proveedor idProveedor;

	public Articulo(Long idArticulo, String nombre, Integer cuit, String descripcion, Proveedor idProveedor) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.cuit = cuit;
		this.descripcion = descripcion;
		this.idProveedor = idProveedor;
	}

	public Articulo() {
		super();
	}

	public Long getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Proveedor getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}

	@Override
	public String toString() {
		return "Articulo [idArticulo=" + idArticulo + ", nombre=" + nombre + ", cuit=" + cuit + ", descripcion="
				+ descripcion + ", idProveedor=" + idProveedor + "]";
	}

	

	


	
    



    
    
    
}
