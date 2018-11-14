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
 * ControlCambios generated by hbm2java
 */
@Entity
@Table(name = "control_cambios")
public class ControlCambios implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int secControlCambios;
	private int numHojaConsulta;
	private int codExpediente;
	private Date fecha;
	private String usuario;
	private String tipoControl;
	private String nombreCampo;
	private String valorCampo;
	private String controlador;

	public ControlCambios() {
	}

	public ControlCambios(int secControlCambios, int numHojaConsulta,
			int codExpediente, Date fecha, String usuario, String tipoControl,
			String nombreCampo, String valorCampo, String controlador) {
		this.secControlCambios = secControlCambios;
		this.numHojaConsulta = numHojaConsulta;
		this.codExpediente = codExpediente;
		this.fecha = fecha;
		this.usuario = usuario;
		this.tipoControl = tipoControl;
		this.nombreCampo = nombreCampo;
		this.valorCampo = valorCampo;
		this.controlador = controlador;
	}	

	@Id
	@SequenceGenerator(name = "sec_control_cambios", sequenceName = "control_cambios_sec_control_cambios_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_control_cambios")
	@Column(name = "sec_control_cambios", unique = true, nullable = false)
	public int getSecControlCambios() {
		return this.secControlCambios;
	}

	public void setSecControlCambios(int secControlCambios) {
		this.secControlCambios = secControlCambios;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 29)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "usuario", nullable = false, length = 100)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "tipo_control", nullable = false, length = 24)
	public String getTipoControl() {
		return this.tipoControl;
	}

	public void setTipoControl(String tipoControl) {
		this.tipoControl = tipoControl;
	}

	@Column(name = "nombre_campo", nullable = false, length = 64)
	public String getNombreCampo() {
		return this.nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	@Column(name = "valor_campo", nullable = false)
	public String getValorCampo() {
		return this.valorCampo;
	}

	public void setValorCampo(String valorCampo) {
		this.valorCampo = valorCampo;
	}
	
	@Column(name = "controlador", nullable = false)
	public String getControlador() {
		return controlador;
	}

	public void setControlador(String controlador) {
		this.controlador = controlador;
	}

}
