package com.unsada.practica4.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "fcompras")
public class Fcompras implements Serializable {
	private static final long serialVersionUID = 1L;
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Basic(optional = false)
	    @Column(name = "id_fcompras")
	    private Long idFcompras;
	    
	    @Column(name = "cantidad")
	    private Integer cantidad;
	    
	    @Column(name = "importe")
	    private Float importe;
	    
	    @Column(name = "subtotal")
	    private Double subtotal;
	    
	    @Column(name = "total")
	    private Double total;
	    
	    @Column(name = "iva")
	    private Double iva;

		public Fcompras(Long idFcompras, Integer cantidad, Float importe, Double subtotal, Double total, Double iva) {
			super();
			this.idFcompras = idFcompras;
			this.cantidad = cantidad;
			this.importe = importe;
			this.subtotal = subtotal;
			this.total = total;
			this.iva = iva;
		}

		public Fcompras() {
			super();
		}

		public Long getIdFcompras() {
			return idFcompras;
		}

		public void setIdFcompras(Long idFcompras) {
			this.idFcompras = idFcompras;
		}

		public Integer getCantidad() {
			return cantidad;
		}

		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}

		public Float getImporte() {
			return importe;
		}

		public void setImporte(Float importe) {
			this.importe = importe;
		}

		public Double getSubtotal() {
			return subtotal;
		}

		public void setSubtotal(Double subtotal) {
			this.subtotal = subtotal;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}

		public Double getIva() {
			return iva;
		}

		public void setIva(Double iva) {
			this.iva = iva;
		}

		@Override
		public String toString() {
			return "Fcompras [idFcompras=" + idFcompras + "]";
		}
	    
	 
		 
	    
}
