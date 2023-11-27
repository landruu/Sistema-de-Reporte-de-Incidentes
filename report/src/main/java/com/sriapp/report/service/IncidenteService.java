package com.sriapp.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriapp.report.model.Incidencia;
import com.sriapp.report.repository.IncidenteRepository;

@Service
public class IncidenteService {

	IncidenteRepository Iincidencia;
	
	@Autowired
	public IncidenteService(IncidenteRepository iincidencia) {
		Iincidencia = iincidencia;
	}

	public Incidencia guardar(Incidencia incidencia) {
		return Iincidencia.save(incidencia);
	}
	
	public List<Incidencia> listarIncidencias() {
		return Iincidencia.findAll();
	}
	
	public void borrarIncidencia(Integer id) {
		Iincidencia.deleteById(id);
    }
	
	public Incidencia buscarById(Integer id) {
		return Iincidencia.findById(id).orElse(null);
	}
}
