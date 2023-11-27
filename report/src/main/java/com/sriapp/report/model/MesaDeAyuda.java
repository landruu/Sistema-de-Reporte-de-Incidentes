package com.sriapp.report.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="mesa_ayuda")
public class MesaDeAyuda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	
	@ManyToMany
	@JoinTable (
			name = "ticket",
			joinColumns = @JoinColumn(name = "id_mesa_ayuda"),
			inverseJoinColumns = @JoinColumn(name = "id_reclamo")
	)
	private List<Reclamo> reclamos;

}
