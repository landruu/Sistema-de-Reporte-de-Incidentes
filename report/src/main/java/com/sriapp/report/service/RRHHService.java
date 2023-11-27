package com.sriapp.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriapp.report.model.RecursoHumano;
import com.sriapp.report.repository.RRHHRepository;

@Service
public class RRHHService {

	@Autowired
	RRHHRepository Irrhh;

	public RecursoHumano guardar(RecursoHumano rrhh) {
		return Irrhh.save(rrhh);
	}
	
	public List<RecursoHumano> listarRRHH() {
		return Irrhh.findAll();
	}
	
	public void borrarExp(Integer id) {
		Irrhh.deleteById(id);
    }
	
	public RecursoHumano buscarById(Integer id) {
		return Irrhh.findById(id).orElse(null);
	}
	
}
