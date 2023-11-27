package com.sriapp.report.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="reclamo")
public class Reclamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
    @JoinColumn(name = "id_cliente_servicio")
	private ClienteServicio clienteServicio;
	
	// Mapeo bidireccional
	@OneToMany(mappedBy="reclamo")
	private List<Problema> problemasDelServicio;
}
