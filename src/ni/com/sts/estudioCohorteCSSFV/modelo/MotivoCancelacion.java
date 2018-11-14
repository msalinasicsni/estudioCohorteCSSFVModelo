package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated Oct 2, 2015 2:04:34 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MotivoCancelacion generated by hbm2java
 */
@Entity
@Table(name = "motivo_cancelacion")
public class MotivoCancelacion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int secMotivoCanc;
	private int numHojaConsulta;
	private int codExpediente;
	private short usuarioCancela;
	private Date fechaCancela;
	private String motivo;

	public MotivoCancelacion() {
	}

	public MotivoCancelacion(int secMotivoCanc, int numHojaConsulta,
			int codExpediente, short usuarioCancela, Date fechaCancela,
			String motivo) {
		this.secMotivoCanc = secMotivoCanc;
		this.numHojaConsulta = numHojaConsulta;
		this.codExpediente = codExpediente;
		this.usuarioCancela = usuarioCancela;
		this.fechaCancela = fechaCancela;
		this.motivo = motivo;
	}

	@Id
	@SequenceGenerator(name = "sec_motivo_canc", sequenceName = "motivo_canc_sec_motivo_canc_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_motivo_canc")
	@Column(name = "sec_motivo_canc", unique = true, nullable = false)
	public int getSecMotivoCanc() {
		return this.secMotivoCanc;
	}

	public void setSecMotivoCanc(int secMotivoCanc) {
		this.secMotivoCanc = secMotivoCanc;
	}

	@Column(name = "num_hoja_consulta", nullable = false)
	public int getNumHojaConsulta() {
		return this.numHojaConsulta;
	}

	public void setNumHojaConsulta(int numHojaConsulta) {
		this.numHojaConsulta = numHojaConsulta;
	}

	@Column(name = "cod_expediente", nullable = false)
	public int getCodExpediente() {
		return this.codExpediente;
	}

	public void setCodExpediente(int codExpediente) {
		this.codExpediente = codExpediente;
	}

	@Column(name = "usuario_cancela", nullable = false)
	public short getUsuarioCancela() {
		return this.usuarioCancela;
	}

	public void setUsuarioCancela(short usuarioCancela) {
		this.usuarioCancela = usuarioCancela;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_cancela", nullable = false, length = 29)
	public Date getFechaCancela() {
		return this.fechaCancela;
	}

	public void setFechaCancela(Date fechaCancela) {
		this.fechaCancela = fechaCancela;
	}

	@Column(name = "motivo", nullable = false, length = 200)
	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}