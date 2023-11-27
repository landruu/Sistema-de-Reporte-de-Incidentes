package com.sriapp.report.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="comercial")
public class Comercial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
}
