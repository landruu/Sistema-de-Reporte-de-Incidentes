package com.sriapp.report.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	
}
