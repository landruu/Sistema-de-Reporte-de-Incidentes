package com.sriapp.report.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="servicio")
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
}
