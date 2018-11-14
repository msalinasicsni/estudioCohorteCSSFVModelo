package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated 26-feb-2015 20:57:39 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ParametrosSistemas generated by hbm2java
 */
@Entity
@Table(name = "parametros_sistemas")
public class ParametrosSistemas implements java.io.Serializable {

	private int secParametro;
	private short codigoParametro;
	private String nombreParametro;
	private String descripcion;
	private String valores;

	public ParametrosSistemas() {
	}

	public ParametrosSistemas(int secParametro, short codigoParametro,
			String nombreParametro, String valores) {
		this.secParametro = secParametro;
		this.codigoParametro = codigoParametro;
		this.nombreParametro = nombreParametro;
		this.valores = valores;
	}

	public ParametrosSistemas(int secParametro, short codigoParametro,
			String nombreParametro, String descripcion, String valores) {
		this.secParametro = secParametro;
		this.codigoParametro = codigoParametro;
		this.nombreParametro = nombreParametro;
		this.descripcion = descripcion;
		this.valores = valores;
	}

	@Id
	@Column(name = "sec_parametro", unique = true, nullable = false)
	public int getSecParametro() {
		return this.secParametro;
	}

	public void setSecParametro(int secParametro) {
		this.secParametro = secParametro;
	}

	@Column(name = "codigo_parametro", nullable = false)
	public short getCodigoParametro() {
		return this.codigoParametro;
	}

	public void setCodigoParametro(short codigoParametro) {
		this.codigoParametro = codigoParametro;
	}

	@Column(name = "nombre_parametro", nullable = false, length = 32)
	public String getNombreParametro() {
		return this.nombreParametro;
	}

	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}

	@Column(name = "descripcion", length = 64)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "valores", nullable = false, length = 124)
	public String getValores() {
		return this.valores;
	}

	public void setValores(String valores) {
		this.valores = valores;
	}

}
