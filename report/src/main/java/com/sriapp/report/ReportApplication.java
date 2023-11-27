package com.sriapp.report;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sriapp.report.model.Incidencia;
import com.sriapp.report.service.IncidenteService;

@SpringBootApplication
public class ReportApplication {
	
    private static IncidenteService incidService;
    
    public ReportApplication(IncidenteService in) {
    	incidService = in;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(ReportApplication.class, args);
		
		List<Incidencia> incidencias = incidService.listarIncidencias();

		incidencias.stream()
	    .map(str->str.toString()).forEach(System.out::println);

	}

}
