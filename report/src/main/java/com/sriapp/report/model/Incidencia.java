package com.sriapp.report.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="incidencia")
public class Incidencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String consideracion;
	private boolean resuelto;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaResolucion;
	private boolean confirmado;
	
	@ManyToOne
	@JoinColumn(name = "id_tecnico", referencedColumnName = "id")
	private Tecnico tecnicoAsignado;
	
	@ManyToOne
	@JoinColumn(name = "id_ticket", referencedColumnName = "id")
	private Ticket ticket;

	@Override
    public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        return "Incidencia: " +
                "N: " + id +
                ", Se considera: " + consideracion + '\'' +
                ", Resuelto?: '" + (resuelto ? "Si" : "No") + '\'' +
                ", Inicio: '" + fechaInicio.format(formatter) + '\'' +
                ", Finaliza: '" + fechaResolucion.format(formatter) + '\'' +
                ", Se confirmo?: '" + (confirmado ? "Si" : "No" ) + '\'' +
                ", Tecnico asociado: '" + (tecnicoAsignado != null ? tecnicoAsignado.getNombre() : "N/A") + '\'' +
                ", Ticket N: '" + (tecnicoAsignado != null ? ticket.getId() : "N/A") + '\'' +
                '}';
    }
}
