package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated 26-feb-2015 20:57:39 by Hibernate Tools 4.0.0

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
import javax.persistence.UniqueConstraint;

/**
 * HorarioAtencion generated by hbm2java
 */
@Entity
@Table(name = "horario_atencion", uniqueConstraints = @UniqueConstraint(columnNames = "sec_horario_atencion"))
public class HorarioAtencion implements java.io.Serializable {

	private char turno;
	private int secHorarioAtencion;
	private char dia;
	private Date horaInicio;
	private Date horaFin;

	public HorarioAtencion() {
	}

	public HorarioAtencion(int secHorarioAtencion, char turno, char dia,
			Date horaInicio, Date horaFin) {
		this.turno = turno;
		this.secHorarioAtencion = secHorarioAtencion;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	@Id
	@SequenceGenerator(name = "id_horario_atencion_seq", sequenceName = "horario_atencion_sec_horario_atencion_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_horario_atencion_seq")
	@Column(name = "sec_horario_atencion", unique = true, nullable = false)
	public int getSecHorarioAtencion() {
		return this.secHorarioAtencion;
	}

	public void setSecHorarioAtencion(int secHorarioAtencion) {
		this.secHorarioAtencion = secHorarioAtencion;
	}
	
	@Column(name = "turno", unique = true, nullable = false, length = 1)
	public char getTurno() {
		return this.turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	@Column(name = "dia", nullable = false, length = 1)
	public char getDia() {
		return this.dia;
	}

	public void setDia(char dia) {
		this.dia = dia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora_inicio", nullable = false, length = 29)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora_fin", nullable = false, length = 29)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

}
