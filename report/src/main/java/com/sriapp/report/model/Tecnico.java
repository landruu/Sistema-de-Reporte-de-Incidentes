package com.sriapp.report.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="tecnico")
public class Tecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private boolean disponible;
	private String correo;
	
	public String getNombre() {
		return nombre;
	}
}
