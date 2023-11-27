package com.sriapp.report.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="especialidad_tecnico")
public class EspecialidadTecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @OneToOne
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;

    @OneToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;
}
