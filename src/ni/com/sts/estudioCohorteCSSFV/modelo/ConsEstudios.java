package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated 26-feb-2015 20:57:39 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ConsEstudios generated by hbm2java
 */
@Entity
@Table(name = "cons_estudios")
public class ConsEstudios implements java.io.Serializable {

	private int secConsEstudios;
	private Date fecha;
	private int codigoExpediente;
	private short codigoConsentimiento;
	private Short asentchik;
	private Short parteb;
	private Short partec;
	private Short parted;
	private Short asentimientoesc;
	private Short partee;
	private Short partef;
	private String tipoparttrans;
	private String reactivacion;
	private Date ahora;
	private Character retirado;

	public ConsEstudios() {
	}

	public ConsEstudios(int secConsEstudios, Date fecha, int codigoExpediente,
			short codigoConsentimiento) {
		this.secConsEstudios = secConsEstudios;
		this.fecha = fecha;
		this.codigoExpediente = codigoExpediente;
		this.codigoConsentimiento = codigoConsentimiento;
	}

	public ConsEstudios(int secConsEstudios, Date fecha, int codigoExpediente,
			short codigoConsentimiento, Short asentchik, Short parteb,
			Short partec, Short parted, Short asentimientoesc, Short partee,
			Short partef, String tipoparttrans, String reactivacion,
			Date ahora, Character retirado) {
		this.secConsEstudios = secConsEstudios;
		this.fecha = fecha;
		this.codigoExpediente = codigoExpediente;
		this.codigoConsentimiento = codigoConsentimiento;
		this.asentchik = asentchik;
		this.parteb = parteb;
		this.partec = partec;
		this.parted = parted;
		this.asentimientoesc = asentimientoesc;
		this.partee = partee;
		this.partef = partef;
		this.tipoparttrans = tipoparttrans;
		this.reactivacion = reactivacion;
		this.ahora = ahora;
		this.retirado = retirado;
	}

	@Id
	@Column(name = "sec_cons_estudios", unique = true, nullable = false)
	public int getSecConsEstudios() {
		return this.secConsEstudios;
	}

	public void setSecConsEstudios(int secConsEstudios) {
		this.secConsEstudios = secConsEstudios;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 29)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "codigo_expediente", nullable = false)
	public int getCodigoExpediente() {
		return this.codigoExpediente;
	}

	public void setCodigoExpediente(int codigoExpediente) {
		this.codigoExpediente = codigoExpediente;
	}

	@Column(name = "codigo_consentimiento", nullable = false)
	public short getCodigoConsentimiento() {
		return this.codigoConsentimiento;
	}

	public void setCodigoConsentimiento(short codigoConsentimiento) {
		this.codigoConsentimiento = codigoConsentimiento;
	}

	@Column(name = "asentchik")
	public Short getAsentchik() {
		return this.asentchik;
	}

	public void setAsentchik(Short asentchik) {
		this.asentchik = asentchik;
	}

	@Column(name = "parteb")
	public Short getParteb() {
		return this.parteb;
	}

	public void setParteb(Short parteb) {
		this.parteb = parteb;
	}

	@Column(name = "partec")
	public Short getPartec() {
		return this.partec;
	}

	public void setPartec(Short partec) {
		this.partec = partec;
	}

	@Column(name = "parted")
	public Short getParted() {
		return this.parted;
	}

	public void setParted(Short parted) {
		this.parted = parted;
	}

	@Column(name = "asentimientoesc")
	public Short getAsentimientoesc() {
		return this.asentimientoesc;
	}

	public void setAsentimientoesc(Short asentimientoesc) {
		this.asentimientoesc = asentimientoesc;
	}

	@Column(name = "partee")
	public Short getPartee() {
		return this.partee;
	}

	public void setPartee(Short partee) {
		this.partee = partee;
	}

	@Column(name = "partef")
	public Short getPartef() {
		return this.partef;
	}

	public void setPartef(Short partef) {
		this.partef = partef;
	}

	@Column(name = "tipoparttrans", length = 32)
	public String getTipoparttrans() {
		return this.tipoparttrans;
	}

	public void setTipoparttrans(String tipoparttrans) {
		this.tipoparttrans = tipoparttrans;
	}

	@Column(name = "reactivacion", length = 32)
	public String getReactivacion() {
		return this.reactivacion;
	}

	public void setReactivacion(String reactivacion) {
		this.reactivacion = reactivacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ahora", length = 29)
	public Date getAhora() {
		return this.ahora;
	}

	public void setAhora(Date ahora) {
		this.ahora = ahora;
	}

	@Column(name = "retirado", length = 1)
	public Character getRetirado() {
		return this.retirado;
	}

	public void setRetirado(Character retirado) {
		this.retirado = retirado;
	}

}
