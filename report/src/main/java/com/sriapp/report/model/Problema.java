package com.sriapp.report.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="problema")
public class Problema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String detalle;
	
	@ManyToOne
	@JoinColumn(name="id_reclamo", referencedColumnName="id")
	private Reclamo reclamo;

}
