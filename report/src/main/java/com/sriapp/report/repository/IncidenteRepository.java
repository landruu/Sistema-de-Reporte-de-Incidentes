package com.sriapp.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriapp.report.model.Incidencia;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidencia, Integer>{

}