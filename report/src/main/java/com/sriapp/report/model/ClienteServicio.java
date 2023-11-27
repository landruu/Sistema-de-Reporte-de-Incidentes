package com.sriapp.report.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente_servicio")
public class ClienteServicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
}
